
import java.util.Scanner;
import java.util.StringTokenizer;
public class  UygulamaSýnavý2{
	
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		/* Klavyeden girilen bir cümleyi ; 
		 * A - ters çeviren,
		 * B - kelime kelime bölen,
		 * C - içindeki harflerin sayýsýný veren, bir harfin kaç kez tekrar ettiðini yazdýran bir program yazýn. */
		
		
		
		System.out.println(" Lütfen bir cümle giriniz...");
		String cümle = girdi.nextLine(); 
		
		int uzunluk = cümle.length();
		System.out.println("Cümlenizin tersten yazýlýþý...");
		
		for (int i = uzunluk -1  ; i >= 0;  i--){
			System.out.print(cümle.charAt(i));
		}
		
		/* Burada kullanýcýdan istenilen metnin uzunluðunu " int uzunluk " olarak tanýmlýyoruz. Daha sonra 
		 * for döngüsünde girilen basamak sayýsýnýn " -1 " ini ( Çünkü charAt 0 olarak baþlar ) int i'ye 
		 * tanýmladýktan sonra i deðeri 0'a eþit olana kadar her dönüþte 1 sayý düþürüyoruz. Bu sýrada da ekrana her 
		 * defasýnda yan yana sondan ilk harfi girdiriyoruz. Böylece tersten yazýlýþýný bulmuþ oluyoruz.*/
		
		
		String ayrac = " ";
		StringTokenizer s = new StringTokenizer(cümle,ayrac);
		System.out.println("\nCümleniz " + s.countTokens() + " kelimeden oluþuyor");
		System.out.println("Bu kelimeler = ");
			
		while(s.hasMoreTokens()){                
												  
		System.out.println(s.nextToken());		  
												
		}
				
		/* Burada StringTokenizer kütüphanesini ekliyoruz. Bunun amacý kelimeleri ayýrmak. Ayraç deðiþkeni 
		 * olarak tanýmladýðýmýz yerler kelimeleri ayýran parametre olarak gözüküyor ve sistem buna göre 
		 * oluþan kelime sayýsýný s.count.Tokens() ile, oluþan kelimeleri ise s.nextToken() ile yazdýrýyor. 
		 * Burada While'in islevini anlamadým ama, o olmadan niçin çalýþmadýðýný */
												   
		String karakter = cümle;
		
		System.out.println("Girdiðiniz cümle'nin karakter sayýsý hesaplanýyor... =" );
		System.out.println(karakter.replace(" ", ""));
				
		
		/* Burada " replace" kodu ile metinde ki boþluk kullanýlan yerine boþluksuz yapýyoruz. Amaç ise boþluk 
		 * ile kullanýlan karakter sayýsýnýn hesabýný bozmamak */
				
		
		int birlesik = karakter.length();
		System.out.println("Girdiðiniz cümlenin karakter sayýsý =" + birlesik);
	
		
		String alfabe = "ABCÇDEFGÐHIÝJKLMNOÖPQRSÞTUÜVWYZabcçdefgðhýijklmnoöpqrsþtuüvwyz0123456789,.:;!?<>=";
		int[] alfabe_dizisi = new int[alfabe.length()]; 
		
		/* Burada alfabede ki bulunan harf / rakam ve iþaretleri metin olarak tanýmlýyoruz.
		 * daha sonra bu metnin uzunluðunu ( içinde bulunan verileri ) " alfabe_dizisi" ne eþitliyoruz */
		
		for (int i = 0; i < cümle.length(); i++) {
			
			int kontrol = alfabe.indexOf(cümle.charAt(i));
			if (kontrol < 0) {continue;};
			
			alfabe_dizisi[kontrol]++;
			
		}
			  	
	    /* Daha sonra cümle uzunluðumuz kadar tekrar edicek bir for döngüsü oluþyuruyoruz. Bu döngü de 0 olarak
	 	 * tanýmladýðýmýz i deðeri, girdiðimiz metinden kýsa oldukça 1 artýyor. Daha sonra tanýmladýðýmýz "charAt(i)" 
	 	 * fonksiyonu döngü gerçekleþtikce sýradan cümledeki karakterleri topluyor ve bu karakterler alfabe dizgisinde var
		 * mý diye kontrol ediyor. Bu iþlemi int kontrol olarak tanýmlýyoruz. Eðer ki burada if döngüsüne giren " kontrol " 
		 * deðiþkeni "0 " dan küçükse " continue " ile eþ geçiyor. Eðer " 0 " dan büyükse tanýmladýðýmýz kontrol'ün sayýsý
		 * 1 arttýrýlýyor.*/
			  	 
		for (int i = 0; i < alfabe_dizisi.length; i++) {
			if (alfabe_dizisi[i] < 1) {
				continue;
			}
			System.out.println(alfabe.charAt(i)+" harfi "+alfabe_dizisi[i]+" kez tekrar etti.");
		
			
		/* Burada ise alfabe_dizisinin uzunluðuna ulaþana kadar i deðiþkenini 1 arttýran bir for döngüsü yazýyoruz.Bu döngüde 
		 * eðer ki alfabe_dizisi[i] 1 den küçükse atlýyor ve yazdýrmýyor. Eðer ki " i " 1'i geçerse her seferinde tek tek;
		 * " ( Metinde kullanýlan harf ) harfi ( tekrar sayýsý ) kez tekrar etti " gibi bir çýktý yazdýrýyor. */
		
		}	
	}
}