package sub3;

	// final class: ��Ӿȵ�
public final class BBB extends AAA{
	
	@Override
	public void method1() {
		System.out.println("BBB = method1()...");
	}
	// Overload	
	public void method2(int a) {
			System.out.println("BBB = method2()...");
	}
				
	@Override  //final�� ���̸� �������̵尡 �ȵȴ�.
	public final void method3() {
				System.out.println("BBB = method3()...");
	}
}
