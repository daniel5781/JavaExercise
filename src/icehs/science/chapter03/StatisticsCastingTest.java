package icehs.science.chapter03;

public class StatisticsCastingTest {

	public static void main(String[] args) {
		double pi = 0.0000001235;
		int au = 150000000;
		long pp = 6973738433L;
		boolean isRight = true;
		int lotto = (int)pi;
		int population = (int) pp;
		
		System.out.println("로또에 당첨될 확률" + pi );
		System.out.println("로또에 당첨될 확률 int 변환" + lotto);	
		System.out.println("전세께의 인구수" + pp );
		System.out.println("전세께의 인구수 int 변환" + population );

	}

}
