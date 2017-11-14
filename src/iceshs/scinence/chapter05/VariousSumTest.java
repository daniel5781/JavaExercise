package iceshs.scinence.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		int sumE=0 ;
		int sumO=0 ;
		
		for(int i=0; i<=1000;i++){
			if(i%2 ==0) {
				sumE +=i;
			}else {
				sumO += i;
			}
		}
		System.out.println(sumE+sumO);
		System.out.println(sumE);
		System.out.println(sumO);
		

	}

}
