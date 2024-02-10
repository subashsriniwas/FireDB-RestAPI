# Firebase Realtime Database CRUD REST API

## Introduction

This project is a RESTful API that provides CRUD (Create, Read, Update, Delete) operations for managing data stored in Firebase Realtime Database. It offers endpoints to interact with the database, allowing users to perform various operations such as creating new records, retrieving existing data, updating records, and deleting entries.

## Features

- **Create**: Add new records to the Firebase Realtime Database.
- **Read**: Retrieve data from the database using various query parameters.
- **Update**: Modify existing records in the database.
- **Delete**: Remove entries from the database.

## Technologies Used

- **Firebase Realtime Database**: Serverless NoSQL cloud database provided by Google Firebase.
- **Node.js**: JavaScript runtime for building scalable server-side applications.
- **Express.js**: Web application framework for Node.js used to create RESTful APIs.
- **RESTful Principles**: Follows REST architectural principles for designing APIs.
- **Postman**: Testing tool for API development and testing.

## Installation

1. Clone the repository:

```bash
git clone https://github.com/your-username/firebase-realtime-database-crud.git
```

2. Navigate to the project directory:

```bash
cd firebase-realtime-database-crud
```

3. Install dependencies:

```bash
npm install
```

4. Set up Firebase Realtime Database:
   - Create a Firebase project in the Firebase Console (https://console.firebase.google.com/)
   - Obtain your Firebase project's credentials and configuration.
   - Configure your Firebase project's Realtime Database rules.
   - Update the Firebase configuration in `config/firebase.js`.

5. Start the server:

```bash
npm start
```

6. The API server should now be running locally. You can access it via `http://localhost:3000`.

## API Endpoints

### Create Record

- **POST /api/records**
  - Create a new record in the database.
  - Request body should contain the data to be added.

### Read Records

- **GET /api/records**
  - Retrieve all records from the database.
- **GET /api/records/:id**
  - Retrieve a specific record by ID.
- **GET /api/records/search?q=query**
  - Search for records based on a query string.

### Update Record

- **PUT /api/records/:id**
  - Update an existing record identified by its ID.
  - Request body should contain the updated data.

### Delete Record

- **DELETE /api/records/:id**
  - Delete a record from the database by ID.

## Usage

- Use a tool like Postman to send HTTP requests to the API endpoints and interact with the Firebase Realtime Database.
- Refer to the API documentation above for details on each endpoint and how to use them.

## Contact

For any inquiries or feedback, please contact [Subash Sriniwas M](mailto:smsubash234@gmail.com).
