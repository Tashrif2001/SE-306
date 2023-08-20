package exception;

public class ExceptionStackTrace {
	public static void main(String[] args) {
		try
		{
			method1();
		}
		catch(Exception e)
		{
			System.err.printf("%s\n\n", e.getMessage());
			e.printStackTrace();
			
			StackTraceElement[] traces = e.getStackTrace();
			
			for(StackTraceElement trace : traces) {
				System.out.printf("%s\t", trace.getClassName());
				System.out.printf("%s\t", trace.getFileName());
				System.out.printf("%s\t", trace.getLineNumber());
				System.out.printf("%s\n", trace.getMethodName());
			}
		}
	}
	public static void method1() throws Exception{
		method2();
	}
	public static void method2() throws Exception{
		method3();
	}
	public static void method3() throws Exception{
		throw new Exception("Exception thrown in method3");
	}
}
