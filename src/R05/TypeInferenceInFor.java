package R05;

public class TypeInferenceInFor {
    public static void main(String[] args) {

        // Wnioskowanie o zmiennej kontrolnej pętli
        for(var x = 2.5; x < 100.0; x = x * 2)
            System.out.println(x + " ");

        System.out.println();

        // Wnioskowanie do zmiennej iteracyjnej
        int[] nums = {1, 2, 3, 4, 5, 6};
        for(var v : nums)
            System.out.println(v + " ");

        System.out.println();

    }
}
