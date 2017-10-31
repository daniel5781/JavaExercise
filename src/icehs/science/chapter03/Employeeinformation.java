package icehs.science.chapter03;

public class Employeeinformation {

	public static void main(String[] args) {
		String name = "홍길동";
		String year = "2002";
		int today = 2017;
		int pyear = Integer.parseInt(year);
		
		System.out.println("이름" + name);
		System.out.println("입사년도" + year);
		System.out.println("근무년수"+ today -pyear);
		
		
		
	}

}
