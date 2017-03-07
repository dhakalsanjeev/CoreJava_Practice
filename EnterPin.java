import java.util.Scanner; 

public class EnterPin {
	public static void main ( String[] args ) {
		Scanner keyboard = new Scanner(System.in); 
		String password, enter; 
		int pin, entry; 
		
		password = "Sanjeev";
		
		pin = 12345; 
		
		System.out.println("WELCOME TO THE BANK OF jAVA");
		System.out.println("PLEASE ENTER THE PASSWORD");
		enter = keyboard.nextLine();
		
			while (! enter.equals("Sanjeev")) {
				System.out.println("\nINCORRECT PASSWOORD, TRY AGAIN");
				System.out.print("ENTER THE PASSWORD ");
				enter = keyboard.nextLine();
			}
			
			System.out.println("\n PASSWORD MATCHED, NOW PLEASE ENTER YOUR PIN");
		
		System.out.print("ENTER YOUR PIN: "); 
		entry = keyboard.nextInt(); 
		
		while(entry !=pin) {
			System.out.println("\nINCORRECT PIN, TRY AGAIN"); 
			System.out.print("ENTER YOUR PIN ");
			entry = keyboard.nextInt();
		}
		
		System.out.println("\nPIN ACCEPTED, YOUR ACCOUNT BALANCE IS $666 ");
	}
}