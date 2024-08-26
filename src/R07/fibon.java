package R07;

public class fibon {
    public static void main(String[] args) {
        Fib ob = new Fib();

        System.out.println(ob.licz(10));            //pokazuje 10 element ciągu


    }
}

class Fib {
    int licz(int n)
    {
        int result;

        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
                } else if (n == 0) {
            result = 0;
        } else if (n == 1) {
            result = 1;
        } else  {
            return  licz(n - 1) + licz(n - 2);
        }
    return result;}
}
