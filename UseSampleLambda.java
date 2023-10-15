package functionalInterfacee;

public class UseSampleLambda {
	public static void main(String[] args) {
//		Sample add = (z,y) ->	z + y;
//		System.out.println(add.num(3, 6));
//		
//		Sample sub = (x,w) -> x - w;
//		System.out.println(sub.num(6, 3));
//		
//		Sample mul = (v,u) -> v * u;
//		System.out.println(mul.num(6, 4));
		
		
		int[] number = {25, 57, 48, 15, 89, 98};
	    Sample min = (b) -> {
			int minn = b[0];
			for(int i = 0; i < b.length; i++) {
				if(b[i] < minn) {
					minn = b[i];
				}
			}
			return minn;
		};
		System.out.println(min.findMax(number));
	}

}
