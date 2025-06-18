public class DocumentFactoryTest {
    public static void main(String[] args) {
        // Create different document factories
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        System.out.println("Testing Word Document Factory:");
        wordFactory.processDocument();

        System.out.println("\nTesting PDF Document Factory:");
        pdfFactory.processDocument();

        System.out.println("\nTesting Excel Document Factory:");
        excelFactory.processDocument();
    }
} 