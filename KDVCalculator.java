import java.util.Scanner;
public class KDVcalculator {
    public static void main(String[] args) {
	        double urunFiyat, kdvTutari, kdvliUrunFiyati, kdvYuzdesi;

	        Scanner input = new Scanner(System.in);  
	        System.out.print("Ürün Fiyatını Giriniz:");
	        urunFiyat = input.nextInt();  
	        if (urunFiyat<=1000){
	            kdvYuzdesi = 0.18;

	            kdvliUrunFiyati = urunFiyat+(urunFiyat*kdvYuzdesi);
	            kdvTutari = kdvliUrunFiyati-urunFiyat;

	            System.out.println("KDV'li ürün fiyatı: "+ kdvliUrunFiyati);
	            System.out.println("KDV Tutarı: "+ kdvTutari);
	        }else {
	            kdvYuzdesi = 0.08;

	            kdvliUrunFiyati = urunFiyat+(urunFiyat*kdvYuzdesi);
	            kdvTutari = kdvliUrunFiyati-urunFiyat;

	            System.out.println("KDV'li ürün fiyatı: "+ kdvliUrunFiyati);
	            System.out.println("KDV Tutarı: "+ kdvTutari);
	    }



	}
}

