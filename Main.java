import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("isim giriniz : ");
        String h = scn.nextLine();
        System.out.println("HOŞGELDİNİZ"+h);

        System.out.println("yaşınızı girin");
        int yas =scn.nextInt();
        if (yas > 18){
            System.out.println("ehliyet alabilir");

    }
        else {
            System.out.println("ehliiyet almak için yaş tutmuyor");
        }
        System.out.println("Sayı Giriniz");
        int gun= scn.nextInt();
        switch (gun){
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;

        }
    }
}