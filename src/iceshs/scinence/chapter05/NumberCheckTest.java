package iceshs.scinence.chapter05;

 import java.util.*;
 
public class NumberCheckTest {

	public static void main(String[] args) {
		System.out.print("ù��° ���� �Է��ϼ���.");
		int first=getUserInput();
		System.out.println("�ι�° ���� �Է��ϼ���");
		int second=getUserInput();
		
		int times=first*second ;
		if (times>=100) {
			System.out.println("���ڸ��� �̻��Դϴ�.");
		}else if (times>=10 && times<100) {
			System.out.println("���ڸ� �� �Դϴ�.");
		}else if (times<10 && times>=0) {
			System.out.println("���ڸ��� �Դϴ�.");
		} else {
			System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		}

	}

	
		public static int getUserInput() {
			Scanner sc = new Scanner (System.in);
			int input = sc.nextInt();
			return input;
			
		}

}
