package generics;

public class MaximumTest {
	public static <T extends Comparable<T>> T getMax(T x, T y, T z){
		T max = x;
		
		if(y.compareTo(max)>0)
			max = y;
		
		if(z.compareTo(max)>0)
			max = z;
		return max;
	}
	
	public static Comparable maximum(Comparable x, Comparable y, Comparable z) {
		Comparable max = x;
		
		if(y.compareTo(max)>0)
			max = y;
		if(z.compareTo(max)>0)
			max = z;
		return max;
	}
	
	public static void main(String[] args) {
		Integer x=4, y=7, z=2;
		Character a='f', b='e', c='y';
		System.out.printf("Max: %s\n", getMax(x,y,z));
		System.out.printf("Max: %s\n", maximum(x,y,z));//same
		System.out.printf("Max: %s\n", getMax(a,b,c));
	}
}
