package R07;

public class RetOb {
    public static void main(String[] args) {
        Test72 ob1 = new Test72(2);
        Test72 ob2;


        ob2 = ob1.incryByTen();
        System.out.println("ob1. a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incryByTen();
        System.out.println("ob2.a po drugim ziwkszeniu: " + ob2.a);
    }
}

class Test72 {
    int a;

    Test72(int a) {
        this.a = a;
    }

    Test72 incryByTen() {
        return new Test72(a + 10);
    }
}
