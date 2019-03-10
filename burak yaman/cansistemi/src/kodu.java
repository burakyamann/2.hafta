import java.util.Scanner;

public class kodu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new
			    Scanner(System.in);
				
				System.out.print("Birinci öðrenci notu gir:");
				byte ogrenci1not = 
				scanner.nextByte();
				
				System.out.print("Ýkinci öðrenci notu gir:");
				byte ogrenci2not = 
				scanner.nextByte();
				
				System.out.print("Üçüncü öðrenci notu gir:");
				byte ogrenci3not = 
				scanner.nextByte();
				
				int ortalama ;
				ortalama = ((ogrenci1not+ogrenci2not+ogrenci3not)/3);
				
				System.out.println("sýnýf ortalamasý;" + ortalama );		
				
				if (ogrenci1not<ortalama) {
					
					System.out.println(ogrenci1not-ortalama + "puan fark ile birinci ogrenci kaldý");	
				} 
				else if (ogrenci2not<ortalama) {
					
					System.out.println(ogrenci2not-ortalama + "puan fark ile ikinci ogrenci kaldý");
				} 
				
		        else if (ogrenci3not<ortalama) {
					
		        	System.out.println(ogrenci3not-ortalama + "puan fark ile üçüncü ogrenci kaldý");
			
				} 
				
		        else {
		        	
		        	System.out.print("Geçti");
		        }
				
		
		
	}

}
