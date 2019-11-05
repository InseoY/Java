package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/*
 * 날짜: 2019/11/05
 * 이름: 양인서
 * 내용: 파일 리더 스트림 실습하기 p1032
 */
public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		
		String file1 = "C:\\Users\\java\\Desktop\\sample1.txt";
		String file2 = "C:\\Users\\java\\Desktop\\sample2.txt";
		
		// 입력스트림 생성 및 파일연결
		FileReader fr = new FileReader(file1);
		
		
		
		// 반복문을 통한 데이터 읽어들이기
		while(true) {
			
			// 입력스트림으로 데이터 읽기
			int data = fr.read();
			
			if(data == -1) {
				break; // 더 이상 읽을 데이터가 없으면
			}
			
					
			char ch = (char) data; // 문자화
			System.out.print(ch);
		}
		// 입출력스트림 해제
		fr.close();
		
		
		System.out.println("\n스트림 작업 끝");
		
	}
}
