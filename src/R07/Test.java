package R07;


// Przekazywanie obiektów do metod
class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    // Zwracanie true jeśli obiekt jest równy aktualnemu obiektowi

    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) {
            return true;
        } else {
            return false;
        }
    }
}

class PassOb {
    public static void main(String[] args) {
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);

        System.out.println("ob1 == ob2 " + ob1.equalTo(ob2));
        System.out.println("ob2 == ob3 " + ob2.equalTo(ob3));
    }
}