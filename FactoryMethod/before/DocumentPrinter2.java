public class DocumentPrinter2  extends AbstractDocumentPrinter {

    @Override
    protected void doBeforePrinting() {
    }

    @Override
    protected void doAfterPrinting() {
        System.out.println("BYE BYE!");
    }

    
    public static void main(String[] args) {
    DocumentPrinter2 printer = new DocumentPrinter2();
    printer.printDocument("DesignPatterns.pdf");
    }
}


