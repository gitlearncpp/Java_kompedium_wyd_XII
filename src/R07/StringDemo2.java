package R07;

public class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "Pierwszy tekst";
        String strOb2 = "Drugi tekst";
        String strOb3 = strOb1;
        String strOb4 = strOb1 + strOb2;

        System.out.println("Długosc strOb1 = " + strOb1.length());                          // dlugosc lancucha znakow
        System.out.println("Znak o indeksie 3 z strOb1: " + strOb1.charAt(3));              // 3. znak z lancucha

        if (strOb1.equals(strOb2)) {                                                        // porównanie strOb1 do strOb2
            System.out.println("strOb1 == strOb2");}
            else {
                System.out.println("strOb1 != strOb2");
            }

            if (strOb1.equals(strOb3)) {                                                    // porownanie strOb1 do strOb2
                System.out.println("strOb1 == strOb3");
            }
            else {System.out.println("strOb1 != strOb3");}

            if (strOb4.equals(strOb1)) {                                                     // porównanie strOb4 do strOb1
                System.out.println("strOb4 == strOb1");
            }
            else {System.out.println("strOb4 != strOb1");}

        }


    }

