package _12_access_modifiers_2;

import _12_access_modifiers.GuvenliKod;

public class Virus {
	
	public String virus()
	{
		String virusUrl = "kötühaberler.com";
		GuvenliKod.ANLASMALI_SITELER[0] = virusUrl;
		GuvenliKod.haberleriAl(virusUrl);
		
		return "";
	}

}
