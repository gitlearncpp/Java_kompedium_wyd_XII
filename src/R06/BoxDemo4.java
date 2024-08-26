package R06;

class Box4 {
    double width;
    double height;
    double depth;

    // obliczenie i zwrócenie wartości
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo4 {
    public static void main(String[] args) {
        Box4 mybox1 = new Box4();
        Box4 mybox2 = new Box4();
        double vol;

        // przypisanie wartości do zmiennych
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // przypisanie wart. do zminnej obiektu mybox 2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 7;


        // pobranie obj. pierwszego pudełka
        // vol = mybox1.volume();
        System.out.println("Objętość to: " + mybox1.volume());

        // pobr. V obiektu 2 -go
        vol = mybox2.volume();
        System.out.println("Objeto to: " + vol);


    }
}
