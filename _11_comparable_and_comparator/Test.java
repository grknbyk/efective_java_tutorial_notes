package _11_comparable_and_comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	
	public static void main(String[] args) {

		ArrayList<Kitap> kitapListesi = new ArrayList<Kitap>();
		
		kitapListesi.add(new Kitap("Şibumi", 500));
		kitapListesi.add(new Kitap("Otomatik Portakal", 200));
		kitapListesi.add(new Kitap("Ab", 250));
		
		Collections.sort(kitapListesi);
		
		System.out.println("\nSıralama Comparable ile");
		for (Kitap kitap : kitapListesi) {
			System.out.println(kitap.toString());
		}
		
		// Sıralama 2
		System.out.println("\nSıralama Comparator implente eden class ile ismeGöre");
		IsımKıyaslama ismeGöre = new IsımKıyaslama();
		Collections.sort(kitapListesi, ismeGöre);
		for (Kitap kitap : kitapListesi) {
			System.out.println(kitap.toString());
		}

		// Sıralama 3
		System.out.println("\nSıralama Comparator anonymous class ile sayfaSayisinaGore");
		Collections.sort(kitapListesi, Kitap.sayfaSayisinaGore);
		for (Kitap kitap : kitapListesi) {
			System.out.println(kitap.toString());
		}

		// Sıralama 4
		System.out.println("\nSıralama Comparator lambda ile ismeGöre");
		Collections.sort(kitapListesi, Kitap.ismeGore);
		for (Kitap kitap : kitapListesi) {
			System.out.println(kitap.toString());
		}
		
			
	}

}

/*
1. Comparable:
Tanım: Comparable arayüzü, bir nesnenin *kendisini* diğer nesnelerle karşılaştırma yeteneği kazanmasını sağlar.
Metod: compareTo(T o) metodunu içerir.
Kullanım: Bir sınıfın doğal sıralama düzenini belirtmek istediğinizde Comparable arayüzünü uygulayabilirsiniz. 
		  Örneğin, String ve Integer gibi bazı yerleşik Java sınıfları zaten Comparable'ı uygular.
Örnek:
public class Kitap implements Comparable<Kitap> {
    private String isim;
    // diğer alanlar ve metodlar...

	// sıralamayı belirleyen metod
    @Override
    public int compareTo(Kitap other) {
        return this.isim.compareTo(other.isim);
    }

	// int dönmesi yeterli compareTo metodunu kulanmaya gerek yok
	// örnek olarak
	@Override
	public int compareTo(Kitap other) {
		return this.sayfaSayisi - other.sayfaSayisi;
	}
}


2. Comparator:
Tanım: Comparator arayüzü, *iki farklı nesneyi* karşılaştırmak için dışsal bir düzeni belirtmek istediğinizde kullanılır.
Metod: compare(T o1, T o2) ve equals(Object obj) metodlarını içerir (ancak genellikle sadece compare üzerine yoğunlaşırız).
Kullanım: Eğer farklı sıralama kriterlerine göre sıralama yapmak isterseniz Comparator kullanabilirsiniz. 
		  Örneğin, aynı nesneyi hem isme göre hem de yaşa göre sıralamak için iki farklı Comparator tanımlayabilirsiniz.

Örnek:
// class olabilir
public class IsmeGoreComparator implements Comparator<Kitap> {
    @Override
    public int compare(Kitap k1, Kitap k2) {
        return k1.getIsim().compareTo(k2.getIsim());
    }
}

// anonymous class ile nesne oluşturulabilir
Comparator<Kitap> ismeGore = new Comparator<Kitap>() {
	@Override
	public int compare(Kitap k1, Kitap k2) {
		return k1.getIsim().compareTo(k2.getIsim());
	}
};

// lambda ile nesne oluşturulabilir
Comparator<Kitap> ismeGore = (k1, k2) -> k1.getIsim().compareTo(k2.getIsim());

// bunda da aynı şekilde int dönmesi yeterli

Karşılaştırma:
Uygulama Yeri: Comparable sınıfın içinde tanımlanırken, Comparator genellikle harici bir sınıf olarak tanımlanır.
Esneklik: Comparable sadece tek bir sıralama kriteri tanımlar, ancak Comparator ile bir sınıf için birden fazla sıralama kriteri tanımlayabilirsiniz.
Kullanım Yeri: Arrays.sort() veya Collections.sort() gibi sıralama metodlarına bir sıralama kriteri sağlamak istemiyorsanız, sınıfların Comparable arayüzünü uygulaması varsayılır. Ancak farklı bir sıralama kriteri kullanmak isterseniz, bu metodlara bir Comparator örneği sağlayabilirsiniz.
Sonuç olarak, doğal bir sıralama düzeni belirlemek istediğinizde Comparable'ı, farklı veya birden fazla sıralama kriteri belirlemek istediğinizde ise Comparator'ı kullanabilirsiniz.
 */
