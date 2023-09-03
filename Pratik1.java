import java.util.Scanner;
public class Pratik1 {
    public static void main(String[] args) {
        //Ders içeriklerini oluşturalım.
        int turkce,matematik,fizik,kimya,tarih,muzik;

        Scanner pratik = new Scanner(System.in);

        System.out.println("Lütfen notlarınızı tam sayı olacak şekilde giriniz.");

        System.out.print("Türkçe notunuzu giriniz:");
        turkce = pratik.nextInt();

        System.out.print("Matematik notunuzu giriniz:");
        matematik = pratik.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fizik = pratik.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya = pratik.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        tarih = pratik.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        muzik = pratik.nextInt();

        int notlarinToplami = (turkce + matematik + fizik + kimya + tarih + muzik);
        double sonuc = notlarinToplami / 6;
        System.out.println("Not Ortalamanız:" + sonuc);

        //Öğrenciye Geçti-Kaldı bilgisi verelim.

        int a=60;
        boolean gecti = a <= sonuc;

        String str = gecti ? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.print(str);
    }
}
