package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/*
 * ��¥: 2019/11/05
 * �̸�: ���μ�
 * ����: ���� ���� ��Ʈ�� �ǽ��ϱ� p1032
 */
public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		
		String file1 = "C:\\Users\\java\\Desktop\\sample1.txt";
		String file2 = "C:\\Users\\java\\Desktop\\sample2.txt";
		
		// �Է½�Ʈ�� ���� �� ���Ͽ���
		FileReader fr = new FileReader(file1);
		
		
		
		// �ݺ����� ���� ������ �о���̱�
		while(true) {
			
			// �Է½�Ʈ������ ������ �б�
			int data = fr.read();
			
			if(data == -1) {
				break; // �� �̻� ���� �����Ͱ� ������
			}
			
					
			char ch = (char) data; // ����ȭ
			System.out.print(ch);
		}
		// ����½�Ʈ�� ����
		fr.close();
		
		
		System.out.println("\n��Ʈ�� �۾� ��");
		
	}
}
