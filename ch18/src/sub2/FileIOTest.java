package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ��¥: 2019/11/05
 * �̸�: ���μ�
 * ����: ���� ����� ��Ʈ�� �ǽ��ϱ� p1018
 */
public class FileIOTest {

	public static void main(String[] args) throws IOException {
		
		String file1 = "C:\\Users\\java\\Desktop\\cameron.jpg";
		String file2 = "C:\\Users\\java\\Desktop\\cameron2.jpg";
		
		// �Է½�Ʈ�� ���� �� ���Ͽ���
		FileInputStream fis = new FileInputStream(file1);
		
		// ��� ��Ʈ�� ���� �� ���Ͽ���
		FileOutputStream fos = new FileOutputStream(file2);
		
		// �ݺ����� ���� ������ �о���̱�
		while(true) {
			
			// �Է½�Ʈ������ ������ �б�
			int data = fis.read();
			
			if(data == -1) {
				break; // �� �̻� ���� �����Ͱ� ������
			}
			
			// ��½�Ʈ������ ������ ����
			fos.write(data);
			
			//char ch = (char) data; // ����ȭ
			
		}
		// ����½�Ʈ�� ����
		fis.close();
		fos.close();
		
		System.out.println("��Ʈ�� �۾� ��");
		
	}
}
