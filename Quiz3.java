import java.util.Random;
import java.util.Scanner;

public class Quiz3 {
	
	public boolean contains(int[] b ,int p) {

	    boolean bool = false;
	    for(int i = 0; i < b.length; i++) {
	        if(p == b[i]) bool = true;
	    }
	    return bool;
	}
	
	public static void main(String[] args) {

		Quiz3 quiz = new Quiz3();
		int[] com = new int[3];	
		int[] user = new int[3];
		Random random = new Random();
		int strike = 0;
		int ball = 0;
		
		for (int i = 0; i < com.length; i++) {
			int temp = random.nextInt(8) + 1;
			System.out.print(" temp : " + temp);	
			
			boolean foo = quiz.contains(com, temp);
			System.out.print(" foo: " + foo);
			if (foo) {
				i--;
				continue;				 
			} else { com[i] = temp; }
			System.out.println(", com["+i+"] = " + com[i]);
		}
		Scanner scan = new Scanner(System.in);	

		while(true) {
			System.out.print("숫자를 입력해주세요 ex)123 : ");
			String input = scan.nextLine();
			
			for (int i = 0; i < input.length(); i++) {
				user[i] = input.charAt(i) - '0'; 
			}		
			for(int i=0;i<user.length;i++) {
	            System.out.println("user["+i+"]="+user[i]);
	        }
			
			for (int i = 0; i < user.length; i++) {
				boolean foo = quiz.contains(com, user[i]);
				if (user[i] == com[i]) strike++;			
				System.out.println( "user["+i+"] = " + user[i] + " : com["+i+"] = " + com[i] + " : skrike " + strike);
				if (user[i] != com[i] && foo) ball++;
				System.out.println("user["+i+"] = " + user[i] + " : com["+i+"] = " + com[i] + " : ball " + ball);
			}
					
			if (strike >= 3) {
				System.out.println(strike + "스트라이크 ");
				System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
				break;
			} else if (ball > 0 && strike > 0) {
				System.out.println(strike + "스트라이크 " + ball + "볼");
				ball = 0; 
				strike = 0;
			} else if (ball > 0 && strike == 0) {
				System.out.println(ball + "볼");
				ball = 0; 
				strike = 0;
			} else if (ball == 0 && strike > 0) {
				System.out.println(strike + "스트라이크");
				ball = 0; 
				strike = 0;
			} else {				
				System.out.println("땡");
				ball = 0; 
				strike = 0;
			}
		}
		scan.close();
	}
	
	
}