package ex1;
/*
 * 날짜 : 2019/10/25
 * 이름 : 양인서
 * 내용: 1번째 수행평가(Parent)
 */
public class Parent {
	public String nation;
	
	public Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
