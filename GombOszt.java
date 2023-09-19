import java.util.Scanner;

class Gomb {
    private double sugar;

    public Gomb(double sugar) {
        this.sugar = sugar;
    }

    public double felszin() {
        return 4 * Math.PI * sugar * sugar;
    }

    public double terfogat() {
        return (4.0 / 3) * Math.PI * sugar * sugar * sugar;
    }
}

public class GombOszt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem adja meg a gömb sugarát (valós számként):");
        double sugar = scanner.nextDouble();

        Gomb gomb = new Gomb(sugar);

        double felszin = gomb.felszin();
        double terfogat = gomb.terfogat();

        System.out.println("A gömb felszíne: " + felszin);
        System.out.println("A gömb térfogata: " + terfogat);

        scanner.close();
    }
}
