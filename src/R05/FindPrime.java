package R05;

public class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime = true;

        num = 13;

        if(num < 2) isPrime = false;
        else isPrime = true;

        for(int i = 2; i <= num/i; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) System.out.println( num + " jest to liczba pierwsza");
        else System.out.println( num + " nie jest liczbą pierwszą");
    }
}
