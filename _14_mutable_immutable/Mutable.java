package _14_mutable_immutable;

public class Mutable extends Immutable {
	private int realValue;

	public Mutable(int value) {
		super(value);

		realValue = value;
	}

	public int getValue() {
		return realValue;
	}

	public void setValue(int newValue) {
		realValue = newValue;
	}

	// Gördüğünüz gibi immutable sınıfın değeri değiştirilebiliyor.
	// Bunu çözmek için immutable sınıfımızı final olarak tanımlanması gerekiyor.
	public static void main(String[] arg) {
		
		Mutable obj = new Mutable(4);
		Immutable immObj = (Immutable) obj;
		
		System.out.println(immObj.getValue());
		
		obj.setValue(8);
		System.out.println(immObj.getValue());
		
	}
}
