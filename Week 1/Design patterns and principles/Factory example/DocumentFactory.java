public abstract class DocumentFactory {
    // Factory method
    public abstract Document createDocument();
    
    // Common method that uses the factory method
    public void processDocument() {
        Document doc = createDocument();
        System.out.println("Processing " + doc.getDocumentType());
        doc.open();
        doc.save();
        doc.close();
    }
} 