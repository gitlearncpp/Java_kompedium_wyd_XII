package R07;

public class VarArgs {

//    Metoda vaTest() jest typu varargs
    static void vaTest(int ... v) {
        System.out.print("Liczba argumentów: " + v.length + " Zawartość: ");

        for (int i : v)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
//        Zauważ, że teraz metoda vaTest() jest
//        po prostu wywoływana ze zmienną liczbą argumentów
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}
