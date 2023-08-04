package variaveis;

import java.util.Scanner;

public class Logica {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double x = 5;
					
		System.out.println(x > 0 && x == 3); 
		
		System.out.println(x <= 0 || x != 3 && x != 5 || x == 5);
		
		in.close();
	}

}
