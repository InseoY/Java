package sub3;
/*
 * 날짜 : 2019/10/23
 * 이름 : 양인서
 * 내용: AutoBoxm AutoUnbox 실습하기 교재 p527(교재맨앞 그림참고)
 */
public class AutoBoxTest {
	
	public static void main(String[] args) {
		
		//Auto Box (기본데이터를 바로 Wrapper 하는거)
		Boolean box1 = false;
		Integer box2 = 2;
		Double box3 = 3.14;
		
		System.out.println("box1 : "+box1);
		System.out.println("box2 : "+box2);
		System.out.println("box3 : "+box3);
		
		//Auto Unboxing
		boolean ubx1 = box1;
		int ubx2 = box2;
		double ubx3 = box3;
		
		System.out.println("ubx1 : "+ubx1);
		System.out.println("ubx2 : "+ubx2);
		System.out.println("ubx3 : "+ubx3);
	}

}
