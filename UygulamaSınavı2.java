
import java.util.Scanner;
import java.util.StringTokenizer;
public class  UygulamaS�nav�2{
	
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		/* Klavyeden girilen bir c�mleyi ; 
		 * A - ters �eviren,
		 * B - kelime kelime b�len,
		 * C - i�indeki harflerin say�s�n� veren, bir harfin ka� kez tekrar etti�ini yazd�ran bir program yaz�n. */
		
		
		
		System.out.println(" L�tfen bir c�mle giriniz...");
		String c�mle = girdi.nextLine(); 
		
		int uzunluk = c�mle.length();
		System.out.println("C�mlenizin tersten yaz�l���...");
		
		for (int i = uzunluk -1  ; i >= 0;  i--){
			System.out.print(c�mle.charAt(i));
		}
		
		/* Burada kullan�c�dan istenilen metnin uzunlu�unu " int uzunluk " olarak tan�ml�yoruz. Daha sonra 
		 * for d�ng�s�nde girilen basamak say�s�n�n " -1 " ini ( ��nk� charAt 0 olarak ba�lar ) int i'ye 
		 * tan�mlad�ktan sonra i de�eri 0'a e�it olana kadar her d�n��te 1 say� d���r�yoruz. Bu s�rada da ekrana her 
		 * defas�nda yan yana sondan ilk harfi girdiriyoruz. B�ylece tersten yaz�l���n� bulmu� oluyoruz.*/
		
		
		String ayrac = " ";
		StringTokenizer s = new StringTokenizer(c�mle,ayrac);
		System.out.println("\nC�mleniz " + s.countTokens() + " kelimeden olu�uyor");
		System.out.println("Bu kelimeler = ");
			
		while(s.hasMoreTokens()){                
												  
		System.out.println(s.nextToken());		  
												
		}
				
		/* Burada StringTokenizer k�t�phanesini ekliyoruz. Bunun amac� kelimeleri ay�rmak. Ayra� de�i�keni 
		 * olarak tan�mlad���m�z yerler kelimeleri ay�ran parametre olarak g�z�k�yor ve sistem buna g�re 
		 * olu�an kelime say�s�n� s.count.Tokens() ile, olu�an kelimeleri ise s.nextToken() ile yazd�r�yor. 
		 * Burada While'in islevini anlamad�m ama, o olmadan ni�in �al��mad���n� */
												   
		String karakter = c�mle;
		
		System.out.println("Girdi�iniz c�mle'nin karakter say�s� hesaplan�yor... =" );
		System.out.println(karakter.replace(" ", ""));
				
		
		/* Burada " replace" kodu ile metinde ki bo�luk kullan�lan yerine bo�luksuz yap�yoruz. Ama� ise bo�luk 
		 * ile kullan�lan karakter say�s�n�n hesab�n� bozmamak */
				
		
		int birlesik = karakter.length();
		System.out.println("Girdi�iniz c�mlenin karakter say�s� =" + birlesik);
	
		
		String alfabe = "ABC�DEFG�HI�JKLMNO�PQRS�TU�VWYZabc�defg�h�ijklmno�pqrs�tu�vwyz0123456789,.:;!?<>=";
		int[] alfabe_dizisi = new int[alfabe.length()]; 
		
		/* Burada alfabede ki bulunan harf / rakam ve i�aretleri metin olarak tan�ml�yoruz.
		 * daha sonra bu metnin uzunlu�unu ( i�inde bulunan verileri ) " alfabe_dizisi" ne e�itliyoruz */
		
		for (int i = 0; i < c�mle.length(); i++) {
			
			int kontrol = alfabe.indexOf(c�mle.charAt(i));
			if (kontrol < 0) {continue;};
			
			alfabe_dizisi[kontrol]++;
			
		}
			  	
	    /* Daha sonra c�mle uzunlu�umuz kadar tekrar edicek bir for d�ng�s� olu�yuruyoruz. Bu d�ng� de 0 olarak
	 	 * tan�mlad���m�z i de�eri, girdi�imiz metinden k�sa olduk�a 1 art�yor. Daha sonra tan�mlad���m�z "charAt(i)" 
	 	 * fonksiyonu d�ng� ger�ekle�tikce s�radan c�mledeki karakterleri topluyor ve bu karakterler alfabe dizgisinde var
		 * m� diye kontrol ediyor. Bu i�lemi int kontrol olarak tan�ml�yoruz. E�er ki burada if d�ng�s�ne giren " kontrol " 
		 * de�i�keni "0 " dan k���kse " continue " ile e� ge�iyor. E�er " 0 " dan b�y�kse tan�mlad���m�z kontrol'�n say�s�
		 * 1 artt�r�l�yor.*/
			  	 
		for (int i = 0; i < alfabe_dizisi.length; i++) {
			if (alfabe_dizisi[i] < 1) {
				continue;
			}
			System.out.println(alfabe.charAt(i)+" harfi "+alfabe_dizisi[i]+" kez tekrar etti.");
		
			
		/* Burada ise alfabe_dizisinin uzunlu�una ula�ana kadar i de�i�kenini 1 artt�ran bir for d�ng�s� yaz�yoruz.Bu d�ng�de 
		 * e�er ki alfabe_dizisi[i] 1 den k���kse atl�yor ve yazd�rm�yor. E�er ki " i " 1'i ge�erse her seferinde tek tek;
		 * " ( Metinde kullan�lan harf ) harfi ( tekrar say�s� ) kez tekrar etti " gibi bir ��kt� yazd�r�yor. */
		
		}	
	}
}