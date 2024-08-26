package R07;

class Box71 {
    double width;
    double height;
    double depth;

    // tworzenie klonu obiektu
    Box71(Box71 ob) { // przekazanie obiektu do konstruktora
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // konstruktor do wszystkich wymiarów
    Box71(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // konstruktor przy braku wymiarów
    Box71() {
        width = 0.0;
        height = 0.0;
        depth = 0.0;
    }

    // konstruktor do szescianow
    Box71(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}


class OverloadCons2 {
    public static void main(String[] args) {
        // tworzenie pudełek za pomoca roznych konstruktorow
        Box71 mybox1 = new Box71(10, 20, 15);
        Box71 mybox2 = new Box71();
        Box71 mybox3 = new Box71(9);


        Box71 myclone = new Box71(mybox1);          // utowrzenie sklonowanego pudelka numer 1
        Box71 myclone2 = new Box71(mybox2);         // utowrzenie sklonowanego pudelka numer 2
        Box71 myclone3 = new Box71(mybox3);         // utowrzenie sklonowanego pudelka numer 1

        double vol;

        // V pudelka nr 1
        vol = mybox1.volume();
        System.out.println("V pudelka nr 1: " + vol);

        // kolejne pudelka
        vol = mybox2.volume();
        System.out.println("V pudelka nr 2: " + vol);

        vol = mybox3.volume();
        System.out.println("V pudelka nr 3: " + vol);

        // objetosc klonu
        vol = myclone.volume();
        System.out.println("V pudelka sklonowanego nr 1 wynosi : " + vol);
    }
}
