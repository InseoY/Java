package sub1;

/*
 * ��¥ : 2019/10/11
 * �̸� : ���μ�
 * ���� : ���ǹ� ��������
 */
public class IfTest {
   public static void main(String[] args) {
	
	   int score = 86;
	   
	   if(score >= 90 && score <= 100) {
		   // 90 ~ 100
	     System.out.println("A �Դϴ�.");
	     
	   }else if(score >= 80 && score < 90) {
		   // 80 ~ 89
	     System.out.println("B �Դϴ�.");
	     
	   }else if(score >= 70 && score < 80) {
		   // 70 ~ 79
	     System.out.println("C �Դϴ�.");
	     
	   }else if(score >= 60 && score < 70) {
		   // 60 ~ 69
	     System.out.println("D �Դϴ�.");
	     
	   }else if(score >= 0 && score < 60) {
		   // 0 ~ 59
	     System.out.println("F �Դϴ�.");
	   }
   }
}
