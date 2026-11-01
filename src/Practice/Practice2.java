package Practice;

public class Practice2 {
	public int sum (int num1,int num2) {
		return num1+ num2;
	}

	public static void main(String[] args) {
		// first approach
		int a = 2;
		int b = 3;
		//int add = a + b;
		//System.out.println(add);

		// Second approach by creating the instance of the class 
		
		Practice2 Add = new Practice2();
		int res = Add.sum(3, 2);
		System.out.println(res);
		
		
		int res2 = Add.sum(5, res);
		System.out.println (res2);
		
		
		// is greater or Equal to 
		
		System.out.println(a<=b);
		
	}

}

     
        
