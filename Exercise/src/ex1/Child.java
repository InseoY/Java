package ex1;
/*
 * ��¥ : 2019/10/25
 * �̸� : ���μ�
 * ����: 1��° ������(Child)
 */
public class Child extends Parent{
	
	private String name;
	public Child() {
		this("ȫ�浿");
		System.out.println("Child() call");
	}
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
