package net.noursicain.gizmojc;

public class EFFRunner {

	public static void main(String[] args) {
		// 
		
		if  (args.length < 2) {
			System.out.println("Usage: EFFRunner inputfile outputfile");
			System.exit(99);
		} else {
			try {
				ExtractFromFile myEFF = new ExtractFromFile();
				myEFF.InputFile = args[0];
				myEFF.OutputFile = args[1];
				myEFF.Log = true;
				
				myEFF.Go();
			} catch (Exception excep) {
				excep.printStackTrace();
		        System.exit(99);
			}; // end try 

		} // endif
		
		
		
	}

}
