package R07;

public class Stack {
    private int[] stck = new int[10];

    private int tos;

    Stack() {
        tos = -1;}

    void push(int item) {
        if (tos == 9) {
            System.out.println("Stos jest pełny");
        } else {
            stck[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stos jest pusty");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}


class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            mystack2.push(i);
        }
        System.out.println("Stos w mystack1:");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Stos w mystack2:");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack2.pop());
        }
    }
}