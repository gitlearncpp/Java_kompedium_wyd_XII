package R03;

public class BoolTest {
    // Użycie typu boolean
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b wynosi " + b);

        b = true;
        System.out.println("b wynosi " + b);

        //Wartość logiczna może sterować instrukcją IF
        if(b) System.out.println("To zostało wykonane ");

        b = false;
        if(b) System.out.println("To nie zostało wykonane ");       // nie ma potrzeby pisać if (b == true)
                                                                    // ten komunikat nie zostanie wyświetlony bo b = false
        // Wynik operatora relacji jest wartością logiczną
        System.out.println("10 > 9 to wartość " + (10 > 9));        // ponieważ 10 > 9, zwracane jest 'true'
    }
}
