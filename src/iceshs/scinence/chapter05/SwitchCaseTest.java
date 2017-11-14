package iceshs.scinence.chapter05;

public class SwitchCaseTest {

	public static void main(String[] args) {
			int score1 = 10;
			int score2 = 20;
			int score3 = 40;
			int score4 = 70;
	        int score5 = 80;
	        double scoreFinal = (double)(score1*score2/2*0.6+(score3+score4)/2*0.13+score5*0.27);
	        int result = (int)(scoreFinal/10);
	        
	        switch(result) {
	        case 9 : System.out.println("Special Class 입니다!!!"); break;
	        case 8 : System.out.println("gold Class 입니다!!!"); break;
	        case 7 : System.out.println("silver Class 입니다!!!"); break;
	        case 6 : System.out.println("bronze Class 입니다!!!"); break;
	        default : System.out.println("member Class 입니다!!!"); 
	       
	        }
	        

	}

}
