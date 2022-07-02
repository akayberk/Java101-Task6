import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        float boy,kilo,vki;
        System.out.println("Lutfen kilonuzu kg cinsinden giriniz.");
        Scanner input = new Scanner(System.in);
        kilo = input.nextFloat();
        System.out.println("Lutfen boyunuzu m cinsinden giriniz");
        boy = input.nextFloat();
        vki=kilo/(boy*boy);
        System.out.println("Vucut kitle endeksiniz =" + vki);

    }
}
