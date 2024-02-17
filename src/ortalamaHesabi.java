import java.util.Scanner;

public class ortalamaHesabi {

            public static void main(String[] args) {

                // scanner nesnesini tanımladık
                Scanner inp = new Scanner(System.in);
                //ders isimleri tanımladık
                int mat,fizik, kimya, turkce, tarih, muzik;

                //kullanıcıdan değerleri aldık
                System.out.println("Matematik Notunuz : ");
                mat= inp.nextInt();

                System.out.println("Fizik Notunuz : ");
                fizik= inp.nextInt();

                System.out.println("Kimya Notunuz : ");
                kimya= inp.nextInt();

                System.out.println("Türkçe Notunuz : ");
                turkce= inp.nextInt();

                System.out.println("Tarih Notunuz : ");
                tarih= inp.nextInt();

                System.out.println("Müzik Notunuz : ");
                muzik= inp.nextInt();
                // kullanıcıdan alınan notların ortalamasını aldık
                int  toplam=(mat+fizik+kimya+turkce+tarih+muzik);
                double sonuc=toplam/6;
                System.out.println("Ortalamanız : "   + sonuc);
                // ortalama sonucuna göre ekrana geçti kaldı yazdırma

                boolean sncKontrol = sonuc>=60;
                String basariDurumu=sncKontrol?"Geçti":"Kaldı";
                System.out.println("basariDurumu" + " : " + basariDurumu);

            }
}



