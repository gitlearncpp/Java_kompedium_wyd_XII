public class IfSample {
    // przykład użycia instrukcji IF
    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;

        if(x < y) System.out.println("x jest mniejsze od y");

        x = x * 2;
        if (x ==y) System.out.println("x jest równe y");

        x = x * 2;
        if (x > y) System.out.println("x jest większe od y");
        if (x==y) System.out.println("a tego nigdy nie zobaczysz");
    }
}
