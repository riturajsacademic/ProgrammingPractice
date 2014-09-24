package aah;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Aah {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("\nHello World");
		String path="C:/progs/aaah.2.in";
		String nextLine="";
		String Line2="";
		/*
		 * 	Delaring FileReading Capability.
		 * */
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		/*
		 * Declaring File Writer capability
		 */
		FileWriter fw = new FileWriter("C:/progs/Myaaah.1.in");
		
		while ((nextLine=textReader.readLine())!=null){
			//System.out.println(nextLine);
			Line2 = textReader.readLine();
			if(nextLine.contains("ah")){
				if(Line2.contains("ah")){
					
					if(nextLine.length()>Line2.length()){
						fw.write(nextLine.concat("\n"));
						fw.write(Line2.concat("\n"));
						fw.write("Go".concat("\n"));
					}
					else{
						fw.write(nextLine.concat("\n"));
						fw.write(Line2.concat("\n"));
						fw.write("No".concat("\n"));
					}
					}
					
				}
				
				
			}
		fw.close();
		}
	}
	
	


