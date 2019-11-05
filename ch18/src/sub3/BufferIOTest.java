package sub3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜: 2019/11/05
 * 이름: 양인서
 * 내용: 파일 버퍼 입출력 스트림 실습하기 p1032
 */
public class BufferIOTest {

	public static void main(String[] args) throws IOException {
		
		String file1 = "C:\\Users\\java\\Desktop\\cameron.jpg";
		String file2 = "C:\\Users\\java\\Desktop\\cameron2.jpg";
		
		// 입력스트림 생성 및 파일연결
		FileInputStream fis = new FileInputStream(file1);	
		FileOutputStream fos = new FileOutputStream(file2);
		
		//버퍼 스트림 생성 및 연결
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		// 반복문을 통한 데이터 읽어들이기
		while(true) {
			
			// 입력스트림으로 데이터 읽기
			int data = bis.read();
			
			if(data == -1) {
				break; // 더 이상 읽을 데이터가 없으면
			}
			
			// 출력스트림으로 데이터 쓰기
			bos.write(data);
			
			//char ch = (char) data; // 문자화
			
		}
		// 입출력스트림 해제
		fis.close();
		fos.close();
		
		System.out.println("스트림 작업 끝");
		
	}
	
}
