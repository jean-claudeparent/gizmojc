package net.noursicain.gizmojc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;





public class ExtractFromFile {
	// This class read a text file and produce an output text file that contains just the urls onr by line
	public String InputFile;
	public String OutputFile;
	public Boolean Log = false;
	
	
	public void Go() throws Exception {
		// extrat url from InputFile and write them in OutputFile
		
		if (Log) System.out.println("Begin ExtractFromFile.go()  ");
		if (Log) System.out.println("Input file  : " + InputFile);
		if (Log) System.out.println("Output file :  " + OutputFile);
		
		File fileInputFile = new File(InputFile);
		
		
		FileInputStream fis = new FileInputStream(fileInputFile);
		//Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		
		String InputLine;
		
		// prepare OutputFile
		File fileOutputFile = new File(OutputFile);
		Writer out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(fileOutputFile), "UTF8"));
		out.append("");
		
		
		
		while ((InputLine = br.readLine()) != null && InputLine.length() != 0)
		{
			
		
			
			
	
		}
		br.close();
		fis.close();;
		out.close();
		
		if (Log) System.out.println("End ExtractFromFile.go()  ");
		
		
		
	} // end Go
		

} // end class

