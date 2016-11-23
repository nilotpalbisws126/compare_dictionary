import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Remove_dictionary {

	public static void main(String[] args) throws IOException
	{
		FileInputStream reader = new FileInputStream("D:/soft/eclipse/dictionary.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(reader, "UTF-8"));
		 File output = new File("D:/soft/eclipse/dictionary_out.txt");
		try {
	        StringBuilder sb = new StringBuilder();
	      int line=br.read();

	        while ((line) != -1) {
	        	if(((line>=33)&&(line<=161))||(line>=168)&&(line<=255))
	        	{
	        	
	        	}
	        	else
	        	{
	            sb.append((char)line);
	           // sb.append(" ");
	        	}
	            line = br.read();
	        }
	        //sb.toString();
	        System.out.print(sb);
	        PrintWriter printer = new PrintWriter(output,"UTF-8");
	        printer.println(sb);
	        printer.close();
	    } finally {
	        br.close();
	    }

}
}