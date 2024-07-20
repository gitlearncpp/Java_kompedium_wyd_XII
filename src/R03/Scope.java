package R03;

public class Scope {
    // ukazanie zasięgów - zagnieżdżanie zasięgów
    public static void main(String[ ] args) {
        int x;                                                     //Widziane cały kod metody

        x = 10;
        if (x == 10) {                                              // Początek nowego zasięgu
            int y = 20;                                             // O zmiennej 'y' wie tylko ten blok

            System.out.println("x oraz y: " + x + " " + y );        // Ten blok widzi 'x' oraz 'y'
            x = y * 2;
        }
        // y = 100;                                                  // Tn blok nie widzi już zmiennej 'y' i będzie błąd
        System.out.println("x wynosi: " + x);
    }
}

/* Komunikat błędu z kompilatora:

        /Users/krzysztofsubartowicz/IdeaProjects/JKP/src/R03/Scope.java:15:9
        java: cannot find symbol
        symbol:   variable y
        location: class R03.Scope
 */
