package Class12;

public class Print {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        p1.addPaper(70);
        p1.addToner(10);
        p1.print(1);
        p1.printerSummary();
        p1.print(5,5);
        p1.printerSummary();
        p1.addPaper(10);
        p1.addToner(-5);
    }
}
