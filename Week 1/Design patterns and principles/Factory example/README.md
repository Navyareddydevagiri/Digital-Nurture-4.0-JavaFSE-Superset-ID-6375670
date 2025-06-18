# Factory Method Pattern Example

This project demonstrates the implementation of the Factory Method design pattern using a document management system.

## Project Structure
- `Document.java`: Interface defining the common behavior for all documents
- `WordDocument.java`, `PdfDocument.java`, `ExcelDocument.java`: Concrete document implementations
- `DocumentFactory.java`: Abstract factory class with the factory method
- `WordDocumentFactory.java`, `PdfDocumentFactory.java`, `ExcelDocumentFactory.java`: Concrete factory implementations
- `DocumentFactoryTest.java`: Test class demonstrating the pattern

## How to Run

1. Compile all Java files:
```bash
javac *.java
```

2. Run the test program:
```bash
java DocumentFactoryTest
```

## Expected Output
When you run the program, you should see:
1. Testing of Word Document Factory with its operations
2. Testing of PDF Document Factory with its operations
3. Testing of Excel Document Factory with its operations

## Implementation Details
- The Factory Method pattern is used to create different types of documents
- Each document type has its own factory class
- The abstract factory class provides a common interface for document creation
- The concrete factory classes handle the creation of specific document types 