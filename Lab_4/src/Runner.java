import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util. *;


public class Runner {

	
	public static void main(String[] args) {
		
		
		Scanner scanner = null;
		
		try {
			
			scanner = new Scanner(new FileReader("src\\in.txt"));
			
			String[] palindrome = scanner.nextLine().split("\\. ");
			
			
			int pal = 0;
			
			for(int i = 0; i<palindrome.length; i++) {
				 
				 System.out.println(palindrome[i]);
				 
				 String p = palindrome[i].replaceAll("\\s+", "");
				 StringBuilder reverce_p = new  StringBuilder();
				 
				 for(int j = p.length()-1; j>=0; j--) {
					 
					char s = p.charAt(j);
					reverce_p.append(s);
					 
				 }
				 

				 
				 if(p.equalsIgnoreCase(reverce_p.toString())) {
					 
					 if(pal < palindrome[i].length()) {
						pal = palindrome[i].length();
				 }
				 
			

			}
			
		
			}
			System.out.println("===========================");
			System.out.println("The longest palindrom has " + pal + " symbols");
			
		}
		
		catch (FileNotFoundException e) {
			System.out.println("File is not found");
		} finally {
			if (scanner != null) {
				scanner.close();
			}

	}
	}
}
