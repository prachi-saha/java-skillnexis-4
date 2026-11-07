# Project Report: Library Management System Using Java

## 1. Introduction

The Library Management System is a simple Java-based application designed to manage book records in a library. It allows users to add, display, search, issue, and return books.

## 2. Objectives

- To maintain book records efficiently.
- To provide easy access to book information.
- To manage book issuing and returning.
- To store records permanently using file handling.

## 3. Technologies Used

- Programming Language: Java
- Concepts: OOP, ArrayList, Methods and File Handling
- Storage: Text File

## 4. Working Logic

The program uses a menu-driven approach to perform different library operations.

1. **Add Book:** Accepts book ID, title, and author name and stores the details in an ArrayList.
2. **Display Books:** Displays all available book records and their status.
3. **Search Book:** Searches for a book using its ID.
4. **Issue Book:** Changes the book status to issued if it is available.
5. **Return Book:** Changes the book status back to available.
6. **Exit:** Terminates the program.

## 5. Implementation

The system uses a Book class to store book details and a LibraryManagementSystem class to perform operations.

ArrayList is used to store multiple book objects. FileWriter is used to save the records, while BufferedReader is used to retrieve the saved information.

## 6. Advantages

- Easy to use and understand.
- Reduces manual record keeping.
- Saves book information permanently.
- Provides simple book searching and tracking.

## 7. Conclusion

The Library Management System demonstrates the practical use of Object-Oriented Programming and File Handling in Java. It provides basic library operations and helps understand how Java concepts can be used to develop real-world applications.
