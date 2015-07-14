package net.noursicain.gizmojc;


import net.noursicain.gizmojc.URLintext;;


public class extractURL {
//Ptovide a class to extract URLs from text
	public String TextToParse;
	public String URL;
	
	
	public Boolean NextURLFound() {
		
	// If an URL is found in TextToParse place it in 
	// URL,return true and remove the URL from TextToParse .
	// if no URL is found set URL and TextToParse to nothing
		URLintext URLExtractor = new URLintext();
		URLExtractor.Split(TextToParse);
		if (URLExtractor.URL == null) {
			TextToParse = null;
			return false;
			
		} // if url = null
		
		return false;
		
	} // end NextURLFound
	
	
} // end class

