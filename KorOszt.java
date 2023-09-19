import java.util.Scanner;

class Kor {
    private double sugar;

    public Kor(double sugar) {
        this.sugar = sugar;
    }

    public double kerulet() {
        return 2 * Math.PI * sugar;
    }

    public double terulet() {
        return Math.PI * sugar * sugar;
    }
}

public class KorOszt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem adja meg a kör sugarát (valós számként):");
        double sugar = scanner.nextDouble();

        Kor Kor = new Kor(sugar);

        double kerulet = Kor.kerulet();
        double terulet = Kor.terulet();

        System.out.println("A kör kerülete: " + kerulet);
        System.out.println("A kör területe: " + terulet);

        scanner.close();
    }
}
