package sub4;
/*
 * ����: 2019/10/17
 * �̸�: ���μ�
 * ����: ��������, �����޼��� �ǽ��ϱ� ���� p236
 */

public class StaticTest {
	public static void main(String[] args) {
		
		//Increment inc1 = new Increment();  �ֳ� �����
		//Increment inc2 = new Increment();
		//Increment inc3 = new Increment();
		
		// ��������(Ŭ��������), �����޼���(Ŭ���� �޼���)�� �̹� �����Ҵ翵��(Method Area)�� �����Ǿ� �ֱ� ������
		// ��ü ���� ���� �ٷ� ���� �Ҽ� �ִ�.
		Increment.num2 = 10;
		Increment.add();
		System.out.println("num2 :"+Increment.num2);
		
		// ��ü ������ �ƴ� ������ü ������
		Calc c = Calc.getInstance();
		
		int rs1 = c.plus(1, 2);
		int rs2 = c.minus(1, 2);
		int rs3 = c.multi(3, 2);
		int rs4 = c.div(4, 2);
		
		System.out.println("rs1:" +rs1);
		System.out.println("rs1:" +rs2);
		System.out.println("rs1:" +rs3);
		System.out.println("rs1:" +rs4);
	}

}
