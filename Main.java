import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    Scanner input= new Scanner(System.in);
    float boy,kilo,endeks;

    System.out.println("Lutfen boyunuzu (metre cinsinde) giriniz :");
    boy=input.nextFloat();
    System.out.println("Lutfen kilonuzu giriniz :");
    kilo=input.nextFloat();

    endeks=kilo/(boy*boy);

    System.out.println("Vucut Kitle Indeksiniz :"+ endeks);





    }

}
