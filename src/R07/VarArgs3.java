package R07;

// metody VARARGS oraz ich przeciążanie
public class VarArgs3 {
    static void VaTest1(int ... v) {
        for (int x : v) {
            System.out.println(x + " ");
        }
    }

    static void VaTest1(boolean ... v) {
        for (boolean x : v) {
            System.out.println(x + " ");
        }
    }

    static void VaTest1(String msg, int... v) {
        for (int x : v) {
            System.out.println(msg + x + " ");
        }
    }

    public static void main(String[] args) {
        VaTest1(1, 2, 3, 4, 5, 6);
        VaTest1(true, false, true, false, true);
        VaTest1("Jeden parametrik: ", 10);
    }
}
