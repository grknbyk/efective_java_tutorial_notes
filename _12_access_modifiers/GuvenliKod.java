package _12_access_modifiers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public abstract class GuvenliKod {

	// başka bir paketten değişkene erişip değiştirirebiliriz
	// _12_access_modifiers_2 paketindeki Virus.java sınıfında değiştiriyoruz
	// bu yüzden önerilmez
	public static final String[] ANLASMALI_SITELER = new String[] { "http://hızlıguvenlitemizhaber.com",
			"http://engercekciharikahaberler.com" };

	// bunun yerine böyle bir kullanımda değişkeni değiştiremeyiz
	private static final String[] ANLASMALI_SITELER_2 = new String[] { "http://hızlıguvenlitemizhaber.com",
			"http://engercekciharikahaberler.com" };
	public static final List<String> ANLASMALI_SITELER_3 = Collections.unmodifiableList(Arrays.asList(ANLASMALI_SITELER_2));

	// veya bu şekilde kullanadabiliriz
	private static final String[] ANLASMALI_SITELER_4 = new String[] { "http://hızlıguvenlitemizhaber.com",
			"http://engercekciharikahaberler.com" };
	// fonksiyon çağırıldığında yeni bir dizi oluşturulur, asıl dizi değişmez
	public static final String[] ANLASMALI_SITELER_5(){
		return ANLASMALI_SITELER_4.clone();
	}
	// veya bu şekilde supplier ile kullanadabiliriz
	public static final Supplier<String[]> ANLASMALI_SITELER_6 = () -> ANLASMALI_SITELER_4.clone();

	

	// this method allows untrusted code to connect to allowed sites (only)
	public static void haberleriAl(String url) {
		for (String haberler : ANLASMALI_SITELER) {
			if (url.equals(haberler)) {
				// Yap bişeyler
			}
		}
	}

	public static final String a = "a";

	public abstract void mesaj();

}

/*
 private:
Tanım: Bir üye (metot veya değişken) private olarak işaretlendiğinde, yalnızca tanımlandığı sınıf içerisinden erişilebilir.
Örnek: private int sayi;

public:
Tanım: public olarak işaretlenen bir üye, Java'daki herhangi bir sınıf tarafından erişilebilir.
Örnek: public void metot() { }

protected:
Tanım: protected olarak işaretlenen bir üye, aynı paketteki diğer sınıflar ve 
bu sınıfı miras alan alt sınıflar tarafından erişilebilir.
Örnek: protected String isim;

default (hiçbir belirleyici kullanılmaz):
Tanım: Eğer bir üyenin erişim belirleyicisi belirtilmemişse, bu üyeye yalnızca aynı paketteki sınıflar erişebilir. 
Bu, "package-private" olarak da adlandırılır.
Örnek: double fiyat;

final:
Tanım: final anahtar kelimesi, bir değişkenin değerinin değiştirilemez olduğunu, bir metodu daha fazla ezilemez olduğunu 
veya bir sınıfın miras alınamaz olduğunu belirtmek için kullanılır.
Örnekler:
Değişken için: final int SABIT = 10;
Metot için: final void metot() { }
Sınıf için: final class Sinif { }

static:
Tanım: static anahtar kelimesi, bir üyenin sınıf seviyesinde olduğunu belirtir, bu da demektir ki 
bu üye tüm nesne örnekleri için ortaktır. Yani, static olarak işaretlenmiş bir değişkene yapılan bir değişiklik, 
bu sınıfın tüm nesne örnekleri tarafından görülebilir.
Örnekler:
Değişken için: static int sayac;
Metot için: static void statikMetot() { }
 */
