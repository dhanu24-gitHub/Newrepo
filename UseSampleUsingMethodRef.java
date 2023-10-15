package functionalInterfacee;

public class UseSampleUsingMethodRef {
	public static void main(String[] args) {
		int[] nums = {24, 57, 35, 89, 14, 6};
		Samp sd = new Samp();
		Sample max = sd::findMaximum;
		System.out.println(max.findMax(nums));
	}

}


class Samp {
	public int findMaximum(int[] a) {
		int max = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
}