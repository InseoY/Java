package sub4;

public class Calc {
	private static Calc instance = new Calc();

	// ½Ì±ÛÅæ(Á¤Àû) °´Ã¼

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
				
	

