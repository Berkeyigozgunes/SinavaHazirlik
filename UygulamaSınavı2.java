
import java.util.Scanner;
import java.util.StringTokenizer;
public class  UygulamaSınavı2{
	
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		/* Klavyeden girilen bir cümleyi ; 
		 * A - ters çeviren,
		 * B - kelime kelime bölen,
		 * C - içindeki harflerin sayısını veren, bir harfin kaç kez tekrar ettiğini yazdıran bir program yazın. */
		
		
		
		System.out.println(" Lütfen bir cümle giriniz...");
		String cümle = girdi.nextLine(); 
		
		int uzunluk = cümle.length();
		System.out.println("Cümlenizin tersten yazılışı...");
		
		for (int i = uzunluk -1  ; i >= 0;  i--){
			System.out.print(cümle.charAt(i));
		}
		
		/* Burada kullanıcıdan istenilen metnin uzunluğunu " int uzunluk " olarak tanımlıyoruz. Daha sonra 
		 * for döngüsünde girilen basamak sayısının " -1 " ini ( Çünkü charAt 0 olarak başlar ) int i'ye 
		 * tanımladıktan sonra i değeri 0'a eşit olana kadar her dönüşte 1 sayı düşürüyoruz. Bu sırada da ekrana her 
		 * defasında yan yana sondan ilk harfi girdiriyoruz. Böylece tersten yazılışını bulmuş oluyoruz.*/
		
		
		String ayrac = " ";
		StringTokenizer s = new StringTokenizer(cümle,ayrac);
		System.out.println("\nCümleniz " + s.countTokens() + " kelimeden oluşuyor");
		System.out.println("Bu kelimeler = ");
			
		while(s.hasMoreTokens()){                
												  
		System.out.println(s.nextToken());		  
												
		}
				
		/* Burada StringTokenizer kütüphanesini ekliyoruz. Bunun amacı kelimeleri ayırmak. Ayraç değişkeni 
		 * olarak tanımladığımız yerler kelimeleri ayıran parametre olarak gözüküyor ve sistem buna göre 
		 * oluşan kelime sayısını s.count.Tokens() ile, oluşan kelimeleri ise s.nextToken() ile yazdırıyor. 
		 * Burada While'in islevini anlamadım ama, o olmadan niçin çalışmadığını */
												   
		String karakter = cümle;
		
		System.out.println("Girdiğiniz cümle'nin karakter sayısı hesaplanıyor... =" );
		System.out.println(karakter.replace(" ", ""));
				
		
		/* Burada " replace" kodu ile metinde ki boşluk kullanılan yerine boşluksuz yapıyoruz. Amaç ise boşluk 
		 * ile kullanılan karakter sayısının hesabını bozmamak */
				
		
		int birlesik = karakter.length();
		System.out.println("Girdiğiniz cümlenin karakter sayısı =" + birlesik);
		
		
		String alfabe = "ABCÇDEFGĞHIİJKLMNOÖPQRSŞTUÜVWYZabcçdefgğhıijklmnoöpqrsştuüvwyz0123456789,.:;!?<>=";
		int[] alfabe_dizisi = new int[alfabe.length()]; 
		
		/* Burada alfabede ki bulunan harf / rakam ve işaretleri metin olarak tanımlıyoruz.
		 * daha sonra bu metnin uzunluğunu ( içinde bulunan verileri ) " alfabe_dizisi" ne eşitliyoruz */
		
		for (int i = 0; i < cümle.length(); i++) {
			
			int kontrol = alfabe.indexOf(cümle.charAt(i));
			if (kontrol < 0) {continue;};
			
			alfabe_dizisi[kontrol]++;
			
		}
			  	
	        /* Daha sonra cümle uzunluğumuz kadar tekrar edicek bir for döngüsü oluşyuruyoruz. Bu döngü de 0 olarak
	 	 * tanımladığımız i değeri, girdiğimiz metinden kısa oldukça 1 artıyor. Daha sonra tanımladığımız "charAt(i)" 
	 	 * fonksiyonu döngü gerçekleştikce sıradan cümledeki karakterleri topluyor ve bu karakterler alfabe dizgisinde var
		 * mı diye kontrol ediyor. Bu işlemi int kontrol olarak tanımlıyoruz. Eğer ki burada if döngüsüne giren " kontrol " 
		 * değişkeni "0 " dan küçükse " continue " ile eş geçiyor. Eğer " 0 " dan büyükse tanımladığımız kontrol'ün sayısı
		 * 1 arttırılıyor.*/
			  	 
		for (int i = 0; i < alfabe_dizisi.length; i++) {
			if (alfabe_dizisi[i] < 1) {
				continue;
			}
			System.out.println(alfabe.charAt(i)+" harfi "+alfabe_dizisi[i]+" kez tekrar etti.");
		
			
		/* Burada ise alfabe_dizisinin uzunluğuna ulaşana kadar i değişkenini 1 arttıran bir for döngüsü yazıyoruz.Bu döngüde 
		 * eğer ki alfabe_dizisi[i] 1 den küçükse atlıyor ve yazdırmıyor. Eğer ki " i " 1'i geçerse her seferinde tek tek;
		 * " ( Metinde kullanılan harf ) harfi ( tekrar sayısı ) kez tekrar etti " gibi bir çıktı yazdırıyor. */
		
		}	
	}
}
