import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileDemo {

	
	 public static void main(String args[]){
		 
		        try {
		            PrintWriter fileout = new PrintWriter(new FileWriter("random.txt"));

		            for (int i = 1; i < 1001; i++) {
		                fileout.println(i);
		            }
		            fileout.close();
		            System.out.println("success...");
		        } catch (Exception e) {
		            System.out.println(e);
		        }
		    }
	 }
		 