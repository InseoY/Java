package ex1;
/*
 * ��¥ : 2019/10/25
 * �̸� : ���μ�
 * ����: 1��° ������(ShopService)
 */
public class ShopService {
	
	private static ShopService instance = new ShopService();
	public ShopService(){}
		public static ShopService getInstance() {
			return instance;
		}
	}


