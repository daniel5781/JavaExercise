package iceshs.scinence.chapter05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		int score = 72;
		
		if(score<=100 && score>=90){
			System.out.println("A학점 입니다.");}
		else if (score<=90 && score>=80){
			System.out.println("B학점 입니다.");}
		else if (score<=80 && score>=70){
			System.out.println("C학점 입니다.");}
		else if (score<=70 && score>=60){
			System.out.println("D학점 입니다.");}
		else {System.out.println("F학접입니다.");
	}

}}
