package ex1;
/*
 * ��¥ : 2019/10/25
 * �̸� : ���μ�
 * ����: 1��° ������(Parent)
 */
public class Parent {
	public String nation;
	
	public Parent() {
		this("���ѹα�");
		System.out.println("Parent() call");
	}
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
