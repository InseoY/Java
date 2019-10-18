package sub4;

public class Calc {
	private static Calc instance = new Calc();

	// 싱글톤(정적), 정적메소드, 객체 ↑정적필드 선언(?)

		public static Calc getInstance() {
			return instance;
		}	
			public Calc() {}
			
			public int plus(int x, int y) {
				int z = x + y;
				return z;
			}
			public int minus(int x, int y) {
				int z = x - y;
				return z;
		}
			public int multi(int x, int y) {
				int z = x * y;
				return z;
			}
			public int div(int x, int y) {
				int z = x / y;
				return z;
			}
   }	
				
	

