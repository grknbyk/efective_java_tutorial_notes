package _11_comparable_and_comparator;

import java.util.Comparator;

public class Kitap implements Comparable<Kitap>{

	private String isim;
	private int sayfa;
	
	public Kitap(String isim, int sayfa) {
		// TODO Auto-generated constructor stub
		this.isim = isim;
		this.sayfa = sayfa;
	}
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getSayfa() {
		return sayfa;
	}

	public void setSayfa(int sayfa) {
		this.sayfa = sayfa;
	}

	// anonymous class ile comparator
	public static final Comparator<Kitap> ismeGore = new Comparator<Kitap>() {
		
		@Override
		public int compare(Kitap o1, Kitap o2) {
			return o1.getIsim().compareTo(o2.getIsim());
		}
	};

	// lambda ile  comparator
	public static final Comparator<Kitap> sayfaSayisinaGore = (o1, o2) -> o1.getSayfa() - o2.getSayfa();
		
	@Override
	public int compareTo(Kitap o) {
		return this.sayfa - o.sayfa;
	}

	@Override
	public String toString() {
		return "Kitap [isim=" + isim + ", sayfa=" + sayfa + "]";
	}
	
}
