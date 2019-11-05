package ex1;
/*
 * 날짜 : 2019/10/25
 * 이름 : 양인서
 * 내용: 1번째 수행평가(ShopService)
 */
public class ShopService {
	
	private static ShopService instance = new ShopService();
	public ShopService(){}
		public static ShopService getInstance() {
			return instance;
		}
	}


