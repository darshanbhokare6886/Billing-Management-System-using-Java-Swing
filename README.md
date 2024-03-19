# Billing-Management-System-using-Java-Swing
This is a billing management system developed using Java Swing for the front end and MySQL for the backend database. It provides functionalities for managing customer information, product information, and generating bills.

##Features:

##1. Customer Information Management:

1. Add new buyers with details such as name, contact number, email, address, and gender.

2. Update existing buyer information.
3. Delete buyers from the database.
4. View a list of all buyers with an option to print their details.

##2. Product Information Management:

1. Add new products with attributes including name, price, description, availability, and automatically generated product ID.
2. Update existing product details.
3. Delete products from the database.
4. View a list of all products with an option to print their details.

##3. Billing Window:

1. Generate bills by selecting a customer (buyer), products purchased, and their quantities.
2. The system generates bills in PDF format.

##Database Schema
The system utilizes MySQL database with the following tables and attributes:

##1. Buyer Table:
Attributes: buyer_id, name, contact_number, email, address, gender

##2. Product Table:
Attributes: product_id, name, price, description, availability

##How to Use

##1. Setting Up the Database:
Ensure you have MySQL installed and running.
Import the provided SQL file to set up the necessary tables and initial data.

##2. Running the Application:
Clone this repository to your local machine.
Open the project in your preferred Java IDE.
Build and run the project.

##3. Using the Application:
Navigate through the different sections (customer information, product information, billing window) using the provided GUI.
Perform actions such as adding, updating, deleting, and viewing customer and product information.
Generate bills by selecting customers, products, and quantities in the billing window.
