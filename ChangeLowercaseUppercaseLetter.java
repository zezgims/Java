
public class ChangeLowercaseUppercaseLetter {

	public static void main(String[] args) 
		throws java.io.IOException {
		
			char ch;
			int changes = 0;
			
			do {
				ch = (char) System.in.read();
				if(ch >= 'A' & ch <= 'Z')
				{
					ch += 32;
					changes++;
					System.out.print(ch);
				}
				else if(ch >= 'a' & ch <= 'z')
				{
					ch -= 32;
					changes++;
					System.out.print(ch);
				}
				else if(ch == ' ')
					System.out.print(" ");
			} while (ch != '.');
			
			System.out.println("\nChanges: " + changes);
		}

}
