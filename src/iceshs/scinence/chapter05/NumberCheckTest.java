package iceshs.scinence.chapter05;

 import java.util.*;
 
public class NumberCheckTest {

	public static void main(String[] args) {
		System.out.print("첫번째 수를 입력하세요.");
		int first=getUserInput();
		System.out.println("두번째 수를 입력하세요");
		int second=getUserInput();
		
		int times=first*second ;
		if (times>=100) {
			System.out.println("세자리수 이상입니다.");
		}else if (times>=10 && times<100) {
			System.out.println("두자리 수 입니다.");
		}else if (times<10 && times>=0) {
			System.out.println("한자리수 입니다.");
		} else {
			System.out.println("음수는 확인하지 않습니다.");
		}

	}

	
		public static int getUserInput() {
			Scanner sc = new Scanner (System.in);
			int input = sc.nextInt();
			return input;
			
		}

}
