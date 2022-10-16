package org.selenium.constants;

public final class FrameworkConstants {
	
	private FrameworkConstants()
	{
		
	}

	private static final String CHROMEDRIVERPATH=System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe";
	
	public static String getChromedriverpath() {
		return CHROMEDRIVERPATH;
	} 
	
	
}
