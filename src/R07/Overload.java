package R07;

class OverloadDemo {
    void test() {
        System.out.println("Brak parametrów");
    }

    void test(int a) {
        System.out.println(a);
    }

    void test(int a, int b) {
        System.out.println("a:" +a + " b: " +b);
    }

    void test(double a) {
        System.out.println("double a: " +a);

    }


}

class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        // wywyłanie wszystkich metod test
        ob.test();
        ob.test(10);
        ob.test(10,20);
        //result = ob.test(123.25);
        System.out.println("Wynik wykonania ob.test 12.5 ");
    }
}
