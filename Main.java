import java.util.Scanner;
import java.math.MathContext;
public class Main {

    static void toplama (){
        int num,total=0,i=1;
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println(i++ +". sayı: ");
            num = input.nextInt();

            if(num == 0){
                break;
            }
            total += num;
        }
        System.out.println("Sonuç: "+total);

    }

    static void cikarma(){
        int num,sonuc=0,i=1,adet;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz? ");
        adet = input.nextInt();

        for(i=1 ; i<=adet ; i++){
            System.out.println(i +".sayı");
            num = input.nextInt();

            if(i==1){
                sonuc += num;
                continue;
            }
            sonuc -= num;

        }
        System.out.println("Sonuç: "+sonuc);

    }

    static void carpma(){
        int num,carpim=1,i=1;

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println(i++ +". sayı");
            num = input.nextInt();

            if(num == 1){
                break;
            }
            if(num == 0){
                carpim = 0;
                break;
            }
            carpim *= num;
        }
        System.out.println("Çarpım: "+carpim);


    }

    static void bolme(){
        int i=1,adet,num;
        float bolum=1.1f;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz? ");
        adet = input.nextInt();
        for(i=1; i<=adet; i++){
            System.out.println(i + ". sayı");
            num = input.nextInt();

            if(i!=1 && num == 0){
                System.out.println("Böleni 0 olarak giremezsiniz.");
               continue;

            }
            if(i == 1){
                bolum = num;
                continue;
            }
            bolum /= num;
        }
        System.out.println("Bölüm: "+bolum);

    }

    static void usHesaplama(){
        int sonuc=1;
        double num,i;
        Scanner input = new Scanner(System.in);

        System.out.println("Taban sayısını giriniz.");
        num = input.nextDouble();

        System.out.println("Üs sayısını giriniz.");
        i =input.nextDouble();

       if(num ==0 ){
           sonuc = 0;
           System.out.println("Sonuç: "+sonuc);
       }
       if(num != 0 && i==0){
           sonuc =1;
           System.out.println("sonuç: "+sonuc);
       }
       else{
           sonuc = (int) Math.pow(num,i);
           System.out.println("Sonuç: "+sonuc);
       }
    }

    static void faktoriyel(){
        int num,i=1,faktoriyel=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Faktoriyelinin alınmasını istediğiniz sayıyı giriniz.");
        num = input.nextInt();



        for(i=1; i<=num; i++){


            faktoriyel *= i;
        }
        System.out.println("Faktoriyel: "+faktoriyel);

    }

    static void mod(){
        int num,i,mod=1;

        Scanner input = new Scanner(System.in);

        System.out.println("Mod almak istediğiniz sayıyı giriniz: ");
        num = input.nextInt();

        System.out.println("Hangi sayıya göre mod almak istediğinizi giriniz.");
        i = input.nextInt();

        if(num ==0){
            System.out.println("Geçersiz sayı girdiniz.");
            mod = 0;
            System.out.println("Mod: "+mod);
        }
        if(i==0){
            System.out.println("Geçersiz sayı girdiniz.");
            mod=0;
            System.out.println("Mod: "+mod);
        }
        else{
            mod = num%i;
            System.out.println("Mod: "+mod);
        }
    }

    static void alanCevre(){
        int uzunKenar,kisaKenar,alan=1,cevre=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgenin uzun kenarını giriniz.");
        uzunKenar = input.nextInt();

        System.out.println("Dikdortgenin kısa kenarını giriniz.");
        kisaKenar = input.nextInt();

        if(uzunKenar<=0 || kisaKenar<=0){
            System.out.println("Geçersiz uzunluk girdiniz");
            alan = 0;
            cevre =0;
            System.out.println("alan: "+alan+" cevre: "+cevre);
        }
        else{
            alan = uzunKenar*kisaKenar;
            cevre = 2*(uzunKenar+kisaKenar);
            System.out.println("alan: "+alan+" cevre: "+cevre);
        }
    }

    public static void main(String[] args) {
      int i;
      Scanner input =new Scanner(System.in);
      System.out.println("Yapmak istediğiniz işlemi rakamlarla seçiniz:" +
              "\n 1-Toplama\n 2-Çıkarma \n 3-Çarpma \n 4-Bölme \n 5-Üslü Sayı Hesaplama" +
              "\n 6-Faktoriyel Hesaplama \n 7-Mod Alma \n 8-Dikdötgen Alan ve Çevre Hesabı" );
      i= input.nextInt();
      
      if(i==1){
          toplama();
      }
      else if(i==2){
          cikarma();
      } else if (i==3){
          carpma();
        
          
      } else if (i==4) {
          bolme();
      } else if (i==5) {
          usHesaplama();
      } else if (i==6) {
          faktoriyel();
      } else if (i==7) {
          mod();
      }else if(i==8){
          alanCevre();
      }
      else{
          System.out.println("Geçersiz seçim yaptınız.");
      }
    }
}
