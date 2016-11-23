import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Remove_corpus {

	public static void main(String[] args) throws IOException
	{
		FileInputStream reader = new FileInputStream("D:/soft/eclipse/corpus.txt");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(reader, "Unicode"));
		 File output = new File("D:/soft/eclipse/corpus_out.txt");
		try {
	        StringBuilder sb = new StringBuilder();
	      int line=br1.read();

	        while ((line) != -1) {
	        	if(((line>=33)&&(line<=161))||(line>=168)&&(line<=255)||(line==2404))
	        	{
	        	
	        	}
	        	else
	        	{
	            sb.append((char) line);
	          // sb.append(" ");
	        	}
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