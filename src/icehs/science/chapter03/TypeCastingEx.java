package icehs.science.chapter03;

public class TypeCastingEx {

	public static void main(String[] args) {
			long billWealth = 700000000L;
			System.out.println("orignal Value" +billWealth);
			
			double doubleBillWealth = billWealth;
			System.out.println("double������ ��ȯ" + doubleBillWealth);
			
			int intBillWealth =(int)billWealth; 
			System.out.println("int ������ ���� ��ȯ :" +intBillWealth);
	}

}
