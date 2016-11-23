import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Tokenize {

	
	public static void main(String[] args) throws IOException
	{
		FileInputStream reader = new FileInputStream("D:/soft/eclipse/corpus_out.txt");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(reader, "UTF-8"));
		 File output = new File("D:/soft/eclipse/token.txt");
		try {
	        StringBuilder sb = new StringBuilder();
	      int line=br1.read();
	      int line1=-1;
	      

	        while ((line) != -1) {
	        	if(line==32)
	        	{	if((line1!=32)&& ((char)line1!='\n'))
	        		sb.append(System.getProperty("line.separator"));
	        	}
	        	else
	        	{
	            sb.append((char) line);
	           //sb.append(" ");
	        	}
	        	line1=line;
	            line = br1.read();
	            
	        }
	        //sb.toString();
	        System.out.print(sb);
	        PrintWriter printer = new PrintWriter(output,"UTF-8");
	        printer.println(sb);
	        printer.close();
	    } finally {
	        br1.close();
	    }

}
	
}
