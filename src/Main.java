import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int armut,domates,elma,muz,patlican;
        double toplam;
        Scanner input =new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? : ");
        armut=input.nextInt();

        System.out.print("Elma Kaç Kilo? : ");
        elma=input.nextInt();

        System.out.print("Muz Kaç Kilo? : ");
        muz=input.nextInt();

        System.out.print("Patlıcan Kaç Kilo? : ");
        patlican=input.nextInt();

        System.out.print("Domates Kaç Kilo? : ");
        domates=input.nextInt();

        toplam=(armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5);

        System.out.println("Toplam tutar: "+toplam + " TL");


    }
}
