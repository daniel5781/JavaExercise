package icehs.science.chapter03;

public class StatisticsCastingTest {

	public static void main(String[] args) {
		double pi = 0.0000001235;
		int au = 150000000;
		long pp = 6973738433L;
		boolean isRight = true;
		int lotto = (int)pi;
		int population = (int) pp;
		
		System.out.println("�ζǿ� ��÷�� Ȯ��" + pi );
		System.out.println("�ζǿ� ��÷�� Ȯ�� int ��ȯ" + lotto);	
		System.out.println("�������� �α���" + pp );
		System.out.println("�������� �α��� int ��ȯ" + population );

	}

}
