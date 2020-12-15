package exceptions;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int user_id = sc.nextInt();
		
		try {
			if(user_id=!1234) {
				throw new InvalidUserIdException();
			}
		}catch(Exception e) {
			
		}
	}

}
