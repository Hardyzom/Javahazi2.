import java.util.Scanner;

class Negyzet {
    private int oldalHossz;

    public Negyzet(int oldalHossz) {
        this.oldalHossz = oldalHossz;
    }

    public int kerulet() {
        return 4 * oldalHossz;
    }

    public int terulet() {
        return oldalHossz * oldalHossz;
    }
}

public class NegyzetOszt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a negyzet oldalhosszat:");
        int oldalHossz = scanner.nextInt();

        Negyzet negyzet = new Negyzet(oldalHossz);

        int kerulet = negyzet.kerulet();
        int terulet = negyzet.terulet();

        System.out.println("A negyzet kerulete: " + kerulet);
        System.out.println("A negyzet terulete: " + terulet);

        scanner.close();
    }
}
