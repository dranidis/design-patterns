public class DocumentPrinter  extends AbstractDocumentPrinter {

    @Override
    protected void doBeforePrinting() {
        System.out.println("Preparing to print document...");
    }

    @Override
    protected void doAfterPrinting() {
        System.out.println("Finished printing document.");
    }

    
    public static void main(String[] args) {
    DocumentPrinter printer = new DocumentPrinter();
    printer.printDocument("DesignPatterns.pdf");
    }
}


