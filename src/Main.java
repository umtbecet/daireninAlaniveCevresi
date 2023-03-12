import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r,pi=3.14,alan,cevre,daireDilimAlani,a;

        System.out.println("Dairenin yarıçapını giriniz");
        r= input.nextDouble();

        System.out.println("Daire dilimi merkez açı ölçüsünü giriniz");
        a= input.nextDouble();



        alan= pi*r*r;
        cevre = 2*pi*r;
        daireDilimAlani = (pi*(r*r)*a)/360;

        System.out.println("Daire alanı : "+alan);
        System.out.println("Daire çevresi : "+ cevre);
        System.out.println("Merkez açısı "+a+" olan daire diliminin alanı : " + daireDilimAlani+ " dır");



    }
}