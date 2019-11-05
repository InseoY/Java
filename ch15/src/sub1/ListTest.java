package sub1;

import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2019/10/24
 * 이름 : 양인서
 * 내용: 컬렉션 프레임워크 List 실습하기 교재 p724
 */
public class ListTest {
	
	public static void main(String[] args) {
		
		//리스트 생성 및 데이터 저장
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.remove(2);
		list1.add(0, 5);
		list1.add(3, 3);
		
		//리스트 원소 출력
		System.out.println("list1 1번째 원소 :"+list1.get(0));
		System.out.println("list1 3번째 원소 :"+list1.get(2));
		System.out.println("list1 4번째 원소 :"+list1.get(3));
		
		// 리스트 생성 및 데이터저장
		List<String> list2 = new ArrayList<>();
		
		list2.add("김유신");
		list2.add("이순신");
		list2.add("정약용");
		
		//리스트 반복문
		for(String name : list2) {
			System.out.println("list2 원소 :"+name);
		}
		
		//사과 리스트 생성 및 사과 저장 (인덱스)
		Apple a1 = new Apple("한국", 3000);
		Apple a2 = new Apple("미국", 2000);
		Apple a3 = new Apple("일본", 1000);

		List<Apple> list3 = new ArrayList<>();
		list3.add(a1);
		list3.add(a2);
		list3.add(a3);
		
		//사과 전체 갯수
		System.out.println("전체 사과 갯수 : "+list3.size());
		
		Apple apple = list3.get(1);
		apple.info();
		
		list3.get(2).info();
	}
	
}
