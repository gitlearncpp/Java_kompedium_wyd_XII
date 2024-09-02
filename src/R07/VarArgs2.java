package R07;

public class VarArgs2 {
//    Tutaj msg to tradycyjny parametr, a v to
//    parametr typu varargs
    static void VaTest(String msg, int ... v) {
        System.out.println(msg + v.length + " Zawartość: ");

        for (int x : v) {
            System.out.println(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        VaTest("Jeden parametrik: ", 10);
        VaTest("kjkjijkjijkjij: ", 1, 2, 3, 4, 5, 6);
        VaTest("Brak parametrów typu varargs: ");
    }

}
