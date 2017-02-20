package pack;

import java.util.Scanner;

public class Zoo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String animals [] = {"perrot","lion","tiger","baran","beer",null,null,null,null,null};
		
		System.out.println("enter 1 for check animal");
		System.out.println("enter 2 to add animal");
		System.out.println("enter 3 for delete animal");
		System.out.println("enter 4 for show all animal");
		
		
		String option = scanner.next();
		switch (option) {
		case "1":{
			System.out.println("enter name of animal");
			String check = scanner.next();
			boolean exist = false;
			
			for (int i = 0; i < animals.length; i++) {
				
				if(animals[i].equalsIgnoreCase(check)){
					System.out.println("e take");
					exist = true;
					break;
				}
				
			
			}
			if(exist == false){
				System.out.println("nema");
			}
					break;
			
		}
		case "2":{
			
			break;
		}
		case "3":{
			
			break;
		}
		case "4":{
			
			break;
		}
		default:
			break;
		}
		
		
		
		
	}
}
