package sub3;

import java.util.HashMap;
import java.util.Map;

import sub1.Banana;

/*
 * 날짜 : 2019/10/24
 * 이름 : 양인서
 * 내용: 컬렉션 프레임워크 Map 실습하기 교재 p724
 */
public class MapTest {
	
	public static void main(String[] args) {
		
		// 맵 생성 및 데이터 저장
		Map<Integer, String> map1 = new HashMap<>();
		
		map1.put(101, "한국");
		map1.put(101, "미국");
		map1.put(101, "일본");
		map1.put(101, "중국");
		
		System.out.println("map1 원소 갯수: "+map1.size());
		
		//맵 원소 꺼내기(1)
		String value = map1.get(101);
		
		System.out.println(value);
		System.out.println(map1.get(103));
		
		// 바나나 맵 생성 및 바나나 저장
		Map<String, Banana> map2 = new HashMap<>();
		map2.put("kor", new Banana("한국", 3000));
		map2.put("usa", new Banana("미국", 2500));
		map2.put("jpn", new Banana("일본", 2000));
		
		// 미국 바나나 꺼내기(1)형식 따라감
		Banana banana = map2.get("usa");
		banana.info();
		
		
	}

}
