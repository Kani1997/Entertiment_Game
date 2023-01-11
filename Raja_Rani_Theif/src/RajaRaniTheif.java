import java.util.Random;
import java.util.Scanner;

public class RajaRaniTheif {
	public static void main(String args[]) {
		Random rnd=new Random();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Press (R) for Raja,(R2) for Rani and(T) for Theif.");
		System.out.print("Enter -");
		String s1;
		
		s1=sc.next();
		
		if(s1.equalsIgnoreCase("R") ||s1.equalsIgnoreCase("R1")|| s1.equalsIgnoreCase("T"))
		
		if(s1.equalsIgnoreCase("R")) {
			System.out.println("You chose -Raja");
		}
		if(s1.equalsIgnoreCase("R1")) {
			System.out.println("You chose -Rani");
			
		}
		if(s1.equalsIgnoreCase("T")) {
			System.out.println("You chose -Theif");
		}
		int rnd1=rnd.nextInt(3)+1;
		
		if(rnd1 == 1) {
			System.out.println( "Computer -Raja");
		}
		else if(rnd1 ==2) {
			System.out.println("Computer -Rani");
		}
		else {
			System.out.println("Computer -Theif");
		}
		if (s1.equalsIgnoreCase("R") && rnd1 == 1) {
            System.out.println("You Lose! Try Again...");
        }
        else if (s1.equalsIgnoreCase("R") && rnd1 == 2) {
            System.out.println("Congratulations! You Won");
        }
        else if (s1.equalsIgnoreCase("R") && rnd1 == 3) {
            System.out.println("Match-Tied");
        }


        if (s1.equalsIgnoreCase("R1") && rnd1 == 1) {
            System.out.println("Match-Tied");
        }
        else if (s1.equalsIgnoreCase("R1") && rnd1 == 2) {
            System.out.println("You Lose! Try Again...");
        }
        else if (s1.equalsIgnoreCase("R1") && rnd1 == 3) {
            System.out.println("Congratulations! You Won");
        }


        if (s1.equalsIgnoreCase("T") && rnd1 == 1) {
            System.out.println("Congratulations! You Won");
        }
        else if (s1.equalsIgnoreCase("T") && rnd1 == 2) {
            System.out.println("Match-Tied");
        }
        else if (s1.equalsIgnoreCase("T") && rnd1 == 3) {
            System.out.println("You Lose! Try Again...");
        }
    else {
        System.out.println("ERROR - Please press (R), (R1) or (T) Only!");
    }

		
	}

}
