package iceshs.scinence.chapter05;

public class Gugudan {

	public static void main(String[] args) {
		for(int i=2;i<10;i++) {
			for(int j=1; j<10;j++) {
				if(i%2==0) {
				System.out.println(i + " * " + j+" = "+(i*j)+"\t");
				}
			}
			System.out.println();
		}
	}

}
