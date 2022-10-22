import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        //Degiskenler
        double boy, kilo, indeks ;

        Scanner input = new Scanner(System.in) ;

        System.out.print("Kilonuz (kg) : ");
        kilo = input.nextDouble() ;

        System.out.print("Boyunuz (m): ");
        boy = input.nextDouble() ;

        indeks = (kilo / (boy*boy)) ;
        System.out.println("Beden Kütle İndeksi : " + indeks);

    }
}
