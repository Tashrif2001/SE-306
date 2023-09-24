package generics;

public class StackTest {
	private Integer[] arr1 = {3,2,12,6,8};
	private Double[] arr2 = {7.5,8.4,1.2,6.8,3.2};
	
	private Stack<Integer>st1;
	private Stack<Double>st2;
	
	public StackTest() {
		st1 = new Stack<Integer>(5);
		st2 = new Stack<Double>(5);	
		
		testPush("Integer", st1, arr1);
		testPush("Double", st2, arr2);
		testPop("Integer", st1, arr1);
		testPop("Double", st2, arr2);
	}
	public <T> void testPush(String name, Stack<T>st, T[] elements) {
		try
		{
			for(T element : elements) {
				System.out.printf("Pushing elements :%s\n", element);
				st.push(element);
			}
		}
		catch(FullStackException e)
		{
			System.out.println();
			e.printStackTrace();
		}
	}
	public <T> void testPop(String name, Stack<T>st, T[] elements) {
		try
		{
			while(true) {
				T popVal = st.pop();
				System.out.printf("Poppped %s\n", popVal);
			}
		}
		catch(EmptyStackException e)
		{
			System.out.println();
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new StackTest();
	}
}
