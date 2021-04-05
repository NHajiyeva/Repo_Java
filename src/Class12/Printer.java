package Class12;

public class Printer {
    static int maxToner = 100;
    static int maxPaper = 100;

    public void addPaper(int papers) {
        if ((papers > 0) && (papers + maxToner <= 100)) {
            System.out.println("Papers in the tray = " + (papers + maxToner));
        } else {
            System.out.println("Invalid enter");
        }
    }

    public void addToner(int toner) {
        if ((toner > 0) && (toner + maxToner <= 100)) {
            System.out.println("Toner level = " + (toner + maxToner));
        } else {
            System.out.println("Invalid enter");
        }
    }

    public void print(int singleSide) {
        maxPaper = maxPaper - singleSide;
        maxToner = maxToner - singleSide;
        if (maxPaper > 0 && maxToner > 0) {
            System.out.println("Toner level: " + maxToner + "\nPaper in tray: " + maxPaper);
        } else {
            System.out.println("Not enough paper or toner");
        }
    }

    public void print(int frontPage, int backPage) {
        maxPaper = maxPaper - frontPage - backPage;
        maxToner = maxToner - frontPage - backPage;
        if (maxPaper > 0 && maxToner > 0) {
            System.out.println("Toner level: " + maxToner + "\nPaper in tray: " + maxPaper);
        } else {
            System.out.println("Not enough paper or toner");
        }
    }

    public void printerSummary() {
        System.out.println("\nToner level: " + maxToner + "\nPaper in tray: " + maxPaper);
    }
}





