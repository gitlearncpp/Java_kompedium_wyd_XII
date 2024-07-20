package R02;

public class BlockTest {
    // Przykład bloku kodu
    public static void main(String[] args) {
        int x, y;
        y = 20;

        //blok kodu
        for (x = 0; x <= 15; x++) {
            System.out.println("Wartość x wynosi " +x);             // Tutaj mamy blok
            System.out.println("Wartość y wynosi " +y);             // Tutaj mamy blok
            y = y - 2;
        }
    }
}
