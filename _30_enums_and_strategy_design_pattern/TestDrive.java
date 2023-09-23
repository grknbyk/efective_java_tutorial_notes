package _30_enums_and_strategy_design_pattern;

import java.math.RoundingMode;

public class TestDrive {
	
	// Tür güvenliği yok.
	// Debug zorlaşacak
	public static final int APPLE_FUJI         = 0;
	public static final int APPLE_PIPPIN       = 1;
	public static final int APPLE_GRANNY_SMITH = 2;
	 
	public static final int ORANGE_NAVEL  = 0;
	public static final int ORANGE_TEMPLE = 1;
	public static final int ORANGE_BLOOD  = 2;
	
	//////////////////////////////////////////
	
	// yukarıdaki gibi tanımlamak yerine enum kullanması daha kolay debug edilebilir ve tür güvenliği sağlar.
	// yukarda değerler int tipinde tutulurken enum sabitleri kendi türlerinde tutulur.
	public enum Apple  { FUJI, PIPPIN, GRANNY_SMITH }
	public enum Orange { NAVEL, TEMPLE, BLOOD }
	
	// Singletonların genelleştirilmiş hali enum olarak düşünülebilir.
	
	/*
	 * Tanımlı her enum sabitini public static final bir alan olarak dışa açan sınıflar olarak düşünülebilirler. 
	 * Enum türleri kalıtılamazlar ve dışarıdan erişilebilir yapıcı metotları olmadığından başka kod parçaları tarafından yaratılamazlar.
	 */
	
	public static void main(String[] args) {
		
		//RoundingMode
		
	}

}
