package R08;

class Box {
    double width;
    double height;
    double depth;

// tworzenie klonu obiektu
    public Box(Box ob) {                        // konstruktor otrzymuje obiekt
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    Box() {
        width = 0;
        height = 0;
        depth = 0;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

// wersja klasy box rozszerzona o jedną zmienną
// widać, że do nowej klasy dołączono klasę bazową BOX
// BOXWEIGHT jest klasą pochodną
class BoxWeight extends Box {
//    ciężar pudełka
    double weight;

//    tworzenie klonu obiektu
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

//    konstruktor domyślny
    BoxWeight() {
        super();
        weight = 0;
    }
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}



public class DemoBoxWeight extends Box {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight();                             // konstruktor domyślny
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myClone = new BoxWeight(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("myBox1:");
        System.out.println("    Volume1 is " + vol);
        System.out.println("    Weight1 is " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("myBox2:");
        System.out.println("    Volume2 is " + vol);
        System.out.println("    Weight2 is " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("myBox3:");
        System.out.println("    Volume3 is " + vol);
        System.out.println("    Weight3 is " + mybox3.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("myCube:");
        System.out.println("    Volume4 is " + vol);
        System.out.println("    Weight4 is " + mycube.weight);
        System.out.println();

        vol = myClone.volume();
        System.out.println("myClone:");
        System.out.println("    Volume5 is " + vol);
        System.out.println("    Weight5 is " + myClone.weight);
        System.out.println();
    }
}
