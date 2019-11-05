package sub3;

	// final class: 상속안됨
public final class BBB extends AAA{
	
	@Override
	public void method1() {
		System.out.println("BBB = method1()...");
	}
	// Overload	
	public void method2(int a) {
			System.out.println("BBB = method2()...");
	}
				
	@Override  //final을 붙이면 오버라이드가 안된다.
	public final void method3() {
				System.out.println("BBB = method3()...");
	}
}
