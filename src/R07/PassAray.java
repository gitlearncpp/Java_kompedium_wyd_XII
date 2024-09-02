package R07;

public class PassAray {
    static void vaTest(int[] v) {
        System.out.println("Liczba argumentów: " + v.length + " Zawartość: ");

        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
//        sposób towrzenia tablicy wymagany do przechowywania argumentów
        int [] n1 = {10};
        int [] n2 = {1, 2, 3};
        int [] n3 = { };

        vaTest(n1); // 1 argument
        vaTest(n2); // 3 argumenty
        vaTest(n3); // brak argumentów
    }
}
