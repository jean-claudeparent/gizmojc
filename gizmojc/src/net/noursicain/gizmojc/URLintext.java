package net.noursicain.gizmojc;

public class URLintext {
	// class to split a test in 3 part, before url, url and after url
	
	public String TextBeforeURL;
	public String URL;
	public String TextAfterURL;
	
	public void Split(String TextToSplit) {
		TextBeforeURL = null;
		TextAfterURL = null;
		URL = null;
		if (PositionURL(TextToSplit) > 0) {
			
		} // end if 
		
	} // end Split
	
	public int PositionURL(String text) {
		// return the position of the first character of the url
		return 0;
	} // end PositionURL()

	
	
	



} // end  URLintext

