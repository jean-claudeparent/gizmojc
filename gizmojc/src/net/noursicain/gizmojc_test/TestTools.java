package net.noursicain.gizmojc_test;

public class TestTools {

	public String Folder (String FolderAsURL) {
		int workIndex;
		
		
		if (FolderAsURL == null)  return "";
		workIndex = FolderAsURL.indexOf("file:");
		if (workIndex  >= 0) FolderAsURL = FolderAsURL.substring(workIndex + 5,FolderAsURL.length());
		workIndex = FolderAsURL.indexOf("Ressources.txt");
		if (workIndex  >= 0) FolderAsURL = FolderAsURL.substring(0,workIndex);
		
		
		
		
		return FolderAsURL;
		
	} // end Folder
} // end class TestTools
