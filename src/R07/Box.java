package R07;

class Box {
    double width;
    double height;
    double depth;

    // Konstruktor przy wszystkich parametrach
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Konstruktor przy braku wymiarów
    Box() {
        width = 0;
        height = 0;
        depth = 0;
    }

    // Konstruktor dla sześcianów
    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class OnerLoadCons {
    public static void main(String[] args) {
        // Utworzenie pudełek za pomocąroznych danych
        Box mybox1 = new Box(10, 20, 30);
        Box mybox2 = new Box();
        Box mycube = new Box(5);

        double vol;
        vol = mybox1.volume();
        System.out.println("Objętość 3 danych wynosi: " +vol);

        vol = mybox2.volume();
        System.out.println("Objętość 3 danych wynosi: " + vol);

        vol = mycube.volume();
        System.out.println("Objętość 3 danych wynosi: " + vol);

        }
    }

