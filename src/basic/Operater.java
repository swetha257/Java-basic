package basic;

public class Operater {
	public static void main(String[] args) {
		//---Unary operator----
		int a=5,b=5;
		System.out.println(++a);
		b++;
		System.out.println(a+b);
		
		System.out.println(--a);
		b--;
		System.out.println(a+b);
		
		//---shift operator0101 ==5/2^------10>>1 explanation  10/2^1  10>>2 explantion 10/2^2
		System.out.println(10>>1);
		System.out.println(10>>2);
		
		//---shift operator0101 1010= 0 ==5/2^------10<<1 explanation  10*2^1  10<<2 explantion 10*2^2
		System.out.println(10<<1);
		System.out.println(10<<2);
		
		//---logical operator		true && true==true
				System.out.println(10>1&& 1<5);//
				System.out.println(10<2 && 5>1);// false&& true=false
				System.out.println(!true);//
				
				System.out.println(!false);
				
				System.out.println(10<2 | 5>1);// false|| true=true
				
				System.out.println(10 & 5);
				int c=a < b ? a:b;
				System.out.println(c);//turnary
	}

}
