public abstract  class AbstractDocumentPrinter {

    // Template method
    public void printDocument(String document) {
        doBeforePrinting();
        System.out.println("Printing document: " + document);
        doAfterPrinting();
    }

    // Hook methods
    abstract protected void doBeforePrinting();

    abstract protected void doAfterPrinting();
}
