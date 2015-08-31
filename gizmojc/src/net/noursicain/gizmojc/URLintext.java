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
		int PositionOfURL = PositionURL(TextToSplit);
		
		if (PositionOfURL > -1) {
			TextBeforeURL = TextToSplit.substring(0,PositionOfURL);
			if (TextBeforeURL.equals("")) TextBeforeURL = null;
			// find the index of the end of the url
			int EndOfURL = PositionOfURL;
			Boolean NotFinished = true;
			while (NotFinished) {
				if ((EndOfURL + 1) > TextToSplit.length()) NotFinished = false;
				else {
					if(CharEndURL(TextToSplit.substring(EndOfURL, EndOfURL + 1))) NotFinished = false;
					else EndOfURL = EndOfURL + 1;
										
				} // if EndOfURL will be greater than the string to split
				
			} // end while
			
			
			URL = TextToSplit.substring(PositionOfURL, EndOfURL);
			
			
			if ((EndOfURL + 1) >= TextToSplit.length()) TextAfterURL = null;
			else TextAfterURL = TextToSplit.substring(EndOfURL, TextToSplit.length());
			
			
			
			
		} // end if 
		
	} // end Split
	
	public int PositionURL(String text) {
		// return the position of the first character of the url
		
		if (text == null) return -1;
		
		int Result;
		int TempResult;
		
		String TextToSearch = text.toLowerCase();
		Result = TextToSearch.indexOf("http://");
		TempResult= TextToSearch.indexOf("https://");
		if (Result == -1) Result = TempResult;
		 else if (TempResult > -1 ) {
			 if (TempResult < Result ) Result = TempResult;
		 } // endif (TempResult > -1 )
		return Result;
		
	} // end PositionURL()
	
	private Boolean CharEndURL(String theChar) {
		// return true if theChar is not a charater possible in a url
		if (theChar.equals(" ")) return true;
		
		return false;
		
	} // end CharEndURL()
	

	
	
	



} // end  URLintext

