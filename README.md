# inventorymanagementsystem
InventoryManagementSystem


Created by Roy Molina on 01-16-24
 *
 * Inventory Management System
 *    - Stores name, SKU, quantity, and price of every product
 *    - Allows users to add, remove, and check on products at will
 *    - Input validation to store correct values
 *    - Object-Oriented Approach with Inventory Class and simplified main method


v1.2 (03-02-24)

CHANGELOG

v1.2 (03-02-24)
- Cleaned up Inventory class, adding a default constructor and private variables for every point of data collected
- Added SKU & Price variables to store more info on Products
- Removed dual arrayLists of names and quantities; instead opted to have an ArrayList of Inventory Objects in the main class
- Added input validation methods to the Main class
- Removed option to remove entire Stock or to add / subtract an amount; will implement again soon

v1.1(01-23-24)
- Added method to give user choice between removing a quantity entirely or subtracting an amount
- Added input validation to keep program from throwing exceptions
- Added a static scanner object for ease
