package _39_method_reference_and_lambda;

import java.time.Instant;

public class TestDrive {

	public static void main(String[] args) {

		// Lambda Kısa Öz
		
		FunctionalString fs = Instant.now()::toString;
		
		System.out.println(fs.yazdır());
		
		

	

	}

}
