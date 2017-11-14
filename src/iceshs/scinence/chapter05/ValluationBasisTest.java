package iceshs.scinence.chapter05;

public class ValluationBasisTest {

	public static void main(String[] args) {
		int score1 = 10;
		int score2 = 20;
		int score3 = 40;
		int score4 = 50;
        int score5 = 80;
        double scoreFinal = (double)(score1*score2/2*0.6+(score3+score4)/2*0.13+score5*0.27);
        
        System.out.println("평가 점수: " + scoreFinal);
		
        if(scoreFinal<=100 && scoreFinal>95){
			System.out.println("Silver Class입니다!!!");}
		else if (scoreFinal<=95 && scoreFinal>90){
			System.out.println("B학점 입니다.");}
		else if (scoreFinal<=90 && scoreFinal>85){
			System.out.println("Silver Class입니다!!!");}
		else {System.out.println("F학점입니다.");
		}
        
	}

}
