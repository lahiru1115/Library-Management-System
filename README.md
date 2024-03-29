# Library Management System

![Cover Photo](system/src/images/screenshots/Header.png)

The Library Management System is a comprehensive software solution designed to automate and streamline the management of a library. It provides different user roles with specific features and functionalities to efficiently handle various library operations.

## User Roles

The Library Management System supports the following user roles:

- **Admin**: Responsible for managing librarians and assistant librarians.
- **Registrar**: Responsible for managing students.
- **Librarian**: Responsible for managing books.
- **Assistant Librarian**: Responsible for handling pending book requests and book returns.
- **Student**: Registered users who can search and request books.

## Features

### Admin

- **Manage Librarians**: Admins can add, view, update, delete, and search librarians in the system.
- **Manage Assistant Librarians**: Admins have the ability to add, view, update, delete, and search assistant librarians.

### Registrar

- **Manage Students**: Registrars can add, view, update, delete, and search student profiles in the system.

### Librarian

- **Manage Books**: Librarians can add, view, update, delete, and search books in the library collection.

### Assistant Librarian

- **Handle Pending Requests**: Assistant librarians can view, search, issue, and cancel pending book requests.
- **Manage Issued Books**: Assistant librarians can view, search, and handle book returns.

### Student

- **Search Books**: Students can search for books available in the library.
- **Request Books**: Students can request books they want to borrow from the library.

## Technologies Used

The Library Management System is built using the following technologies:

- **Java**: The programming language used to develop the system.
- **Swing**: A Java GUI widget toolkit used for creating the graphical user interface of the application.
- **MySQL**: The chosen database management system for storing and retrieving data efficiently.

## Getting Started

To set up the Library Management System, follow these steps:

1. Clone the repository:

   ```bash
   git clone https://github.com/lahiru1115/Library-Management-System.git
   ```

2. Make sure you have Java and MySQL installed on your machine.

3. Import the provided database dump file (`rad_library_v1.sql`) into your MySQL database.

4. Update the database connection details in the Java source code, if necessary.

5. Compile and run the Java program to start the Library Management System.

## User Login Credentials

Use the following login credentials to access different user roles:

- **Admin**
  - **Username**: admin
  - **Password**: 1234

- **Registrar**
  - **Username**: reg
  - **Password**: 1234

- **Librarian**
  - **Username**: lib
  - **Password**: 1234

- **Assistant Librarian**
  - **Username**: assis
  - **Password**: 1234

- **Student**
  - **Username**: lahiru
  - **Password**: 1234 <br> <br>
  - **Username**: ravindu
  - **Password**: 1234 <br> <br>
  - **Username**: dinethi
  - **Password**: 1234

## Screenshots

<table>
  <tr>
    <td colspan="2">
      <img src="system/src/images/screenshots/Screenshot-1.png" alt="Screenshot 1">
    </td>
  </tr>
  <tr>
    <td>
      <img src="system/src/images/screenshots/Screenshot-2.png" alt="Screenshot 2">
    </td>
    <td>
      <img src="system/src/images/screenshots/Screenshot-3.png" alt="Screenshot 3">
    </td>
  </tr>
  <tr>
    <td>
      <img src="system/src/images/screenshots/Screenshot-4.png" alt="Screenshot 4">
    </td>
    <td>
      <img src="system/src/images/screenshots/Screenshot-5.png" alt="Screenshot 5">
    </td>
  </tr>
  <tr>
    <td>
      <img src="system/src/images/screenshots/Screenshot-6.png" alt="Screenshot 6">
    </td>
    <td>
      <img src="system/src/images/screenshots/Screenshot-7.png" alt="Screenshot 7">
    </td>
  </tr>
</table>

## Contributing

Contributions to the Library Management System are welcome! If you'd like to contribute to the project, please follow these guidelines:

1. Fork the repository.

2. Create a new branch for your feature/bug fix.

3. Commit your changes with descriptive commit messages.

4. Push your branch to your forked repository.

5. Submit a pull request to the main repository, explaining the changes you've made.

## Contact

For any inquiries or support regarding Library Management System, please reach out to the project maintainer:

- Name: [Lahiru Dissanayake](https://github.com/lahiru1115)
- Email: [lahirudissanayake15@gmail.com](mailto:lahirudissanayake15@gmail.com)

Feel free to report any issues or suggest enhancements via the [issue tracker](https://github.com/lahiru1115/Library-Management-System/issues).
