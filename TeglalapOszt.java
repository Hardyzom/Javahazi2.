import java.util.Scanner;

class Teglalap {
    private int hossz;
    private int szelesseg;

    public Teglalap(int hossz, int szelesseg) {
        this.hossz = hossz;
        this.szelesseg = szelesseg;
    }

    public int kerulet() {
        return 2 * (hossz + szelesseg);
    }

    public int terulet() {
        return hossz * szelesseg;
    }
}

public class TeglalapOszt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem adja meg a téglalap hosszát (egész számként):");
        int hossz = scanner.nextInt();

        System.out.println("Kérem adja meg a téglalap szélességét (egész számként):");
        int szelesseg = scanner.nextInt();

        Teglalap teglalap = new Teglalap(hossz, szelesseg);

        int kerulet = teglalap.kerulet();
        int terulet = teglalap.terulet();

        System.out.println("A téglalap kerülete: " + kerulet);
        System.out.println("A téglalap területe: " + terulet);

        scanner.close();
    }
}
