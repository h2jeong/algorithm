import java.util.Scanner;

public class Quiz2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		while (true) {
			int com = (int)(Math.random() * 10) % 3 + 1;
			
			int input;
			
			while (true) {
				System.out.print("가위바위보 입력[1: 가위, 2: 바위, 3: 보] >> ");
				input = scan.nextInt();
				if (input >= 1 && input <=3) break;
				System.out.println("[에러] 가위, 바위, 보 셋 중 하나만 선택이 가능합니다.");
			}
			
			System.out.println("[입력값]컴퓨터 = ");
			if (com == 1) System.out.print("가위");
			else if (com == 2) System.out.println("바위");
			else System.out.println("보");
			
			System.out.print("[입력값]게이머 = ");
			if (input == 1) System.out.print("가위");
			else if (input == 2) System.out.println("바위");
			else System.out.println("보");
			
			if (com == input) {
				System.out.println("[결과] 서로 비겼습니다.");
			} else if (com == 1 && input == 2 || com == 2 && input ==3 || com == 3 && input== 1) {
				System.out.println("[결과] 게이머가 이겼습니다.");
				count++;
			} else {
				System.out.println("[결과] 게이머가 졌습니다.");
				break;
			}
			System.out.println();
		}
		System.out.println();
		if (count == 0) {
			System.out.println("[메세지] 한번도 이기지 못했습니다.");
		} else {
			System.out.println("[메세지] 게이머가 " + count + "번 연속 이겼습니다.");
		}
		scan.close();
	}
	
}