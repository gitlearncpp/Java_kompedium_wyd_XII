package R06;

class Box7 {
    double width;
    double height;
    double depth;

    // konstruktor sparametryzowany klasy BOX7
    Box7(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // olicz i zwroc objetosc
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo7 {
    public static void main(String[] args) {
        // deklaracja, alokacja i inicjalizacja obiektów Box7
        Box7 mybox1 = new Box7(10, 20, 15);
        Box7 mybox2 = new Box7(3, 6, 9);

        double vol;

        // pobranie objętości pierwszego pudełka
        vol = mybox1.volume();
        System.out.println("Volume1 is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume2 is " + vol);
    }
}
