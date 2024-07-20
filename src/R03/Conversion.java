package R03;

public class Conversion {
    // Konwersje wymagające rzutowania
    public static void main(String[] args) {
        byte b = 10;
        int i = 257;
        double d = 323.142;
        System.out.println("Dane bez konwersji: ");
        System.out.println("Typ byte, zmienna b wynosi: " +b);
        System.out.println("Typ int, zmienna i wynosi: " + i);
        System.out.println("Typ double, zmienna d wynosi: " + d);
        System.out.println("-----------------------------");

        System.out.println("\nKonwersja z int na byte, zmiana z 10 na 257");
        b = (byte) i;                                                       // modulo maks. wielkości: 257/256 mod 1
        System.out.println("i oraz b " +i + " " +b);

        System.out.println("\nKonwersja z double na int");
        i = (int) d;                                                        // ucięcie po przecienku z 323.142 na 323
        System.out.println("d oraz i "  + d + " " +i);

        System.out.println("\nKonwersja z double na byte");
        b = (byte) d;                                                       // modulo i ucięcie
        System.out.println(" d oraz b " + d + " " +b);

            // Ciekawostka:
            // kod: byte b = 50;
            //      b = b * 2
            // nie wykona się, ponieważ przy 'b * 2' mamy konwersję na typ int, 2 jest typu int, więc
            // b przechodzi do int i pomimo, że byre b = 100, to jest int a nie ma konwersja na mniejsze typt
    }
}
