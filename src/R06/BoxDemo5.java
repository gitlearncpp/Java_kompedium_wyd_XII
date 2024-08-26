package R06;

class Box5 {

        double width;
        double height;
        double depth;

        // oblicz i zwróć objętość
        double volume() {
        return width * height * depth;
    }

    // ustaw wymisry pudełka

    void setDim(double w, double h, double d) {
            width = w;
            height = h;
            depth = d;
    }
}
class BoxDemo5 {
    public static void main(String[] args) {
        Box5 mybox1 = new Box5();   // tworzymy obiekt
        Box5 mybox2 = new Box5();   // tworzymy obiekt
        double vol;

        // inicjalizacja pudełek
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        // pobranie objetosci pierwszego pudełka
        vol = mybox1.volume();
        System.out.println("vol1 = " + vol);

        // pobranie objetosci drugiego pudelka
        vol = mybox2.volume();
        System.out.println("vol2 = " + vol);
    }
}
