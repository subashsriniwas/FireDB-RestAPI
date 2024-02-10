package com.firebase.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {

		ClassLoader classLoader = DemoApplication.class.getClassLoader();
		File file = new File(Objects.requireNonNull(classLoader.getResource("accountServiceKey.json")).getFile());
		FileInputStream serviceAccountStream = new FileInputStream(file.getAbsolutePath());

		// Check if FirebaseApp has not been initialized before initializing it
		if (FirebaseApp.getApps().isEmpty()) {
			FirebaseOptions options = new FirebaseOptions.Builder()
					.setCredentials(GoogleCredentials.fromStream(serviceAccountStream))
					.build();

			FirebaseApp.initializeApp(options);
		}

		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello Spring!");
	}
}
