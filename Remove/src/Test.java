import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Test {

	public static void main(String[] args) throws IOException
	{
		FileInputStream reader21 = new FileInputStream("D:/soft/eclipse/token.txt");
		FileInputStream reader211 = new FileInputStream("D:/soft/eclipse/dictionary_token.txt");
		BufferedReader br21 = new BufferedReader(new InputStreamReader(reader21, "UTF-8"));
		BufferedReader br211 = new BufferedReader(new InputStreamReader(reader211, "UTF-8"));
		 File output21 = new File("D:/soft/eclipse/compare.txt");
		try {
	        StringBuilder sb21 = new StringBuilder();
	        StringBuilder sb211 = new StringBuilder();
	        StringBuilder sb212 = new StringBuilder();
	        //br211.mark(0);
	      int line=br21.read();
	      int line1=br211.read();
	  
	        while ((line) != -1) {
	        		if((char)line!='\n')
	        		{	if(line!=65279)
	        			sb21.append((char) line);
	        		}
	        		else{
		        			 while ((line1) != -1) {
		     	        		if((char)line1!='\n')
		     	        		{	if(line1!=65279)
		     	        			sb211.append((char) line1);
		     	        		}
		     	        		else
		     	        		{
		     	        			
		     	        			if((sb21.length()>0)&&(sb211.length()>0))
		     	        			{
		     	        				
		     	        			if(sb21.toString().equals(sb211.toString()))
		     	        			{
		     	        				sb212.append("yes");
		     	        				sb212.append(",");
		     	        				sb212.append(sb211);
		     	        				//sb212.append(sb21);
		     	        				
		     	        			sb212.append(System.getProperty("line.separator"));
		     	        				
		     	        			}
		     	        			
		     	        			
		     	        			}
		     	        			
		     	        			sb211.setLength(0);
		     	        		
		     	        		}
		     	        		
		     	            line1 = br211.read();
		     	        		
		     	        		
		     	        }
	        			//sb212.append(line1);
	        			sb21.setLength(0);
	        			reader211 = new FileInputStream("D:/soft/eclipse/dictionary_token.txt");
	        			br211 = new BufferedReader(new InputStreamReader(reader211, "UTF-8"));
	     	            line1=br211.read();
	        		
	        		}
	           
	          line=br21.read();
	        }
	        System.out.print(sb212);
	        PrintWriter printer = new PrintWriter(output21,"UTF-8");
	        printer.println(sb212);
	        printer.close();
	    } finally {
	        br21.close();
	        br211.close();
	    }

}
	
	
}


