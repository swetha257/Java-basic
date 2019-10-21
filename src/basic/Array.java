package basic;

public class Array {
	public static void main(String[] args) {
		int a=5;
		int x[]= new int [a];//// data variable declartion =new datatype[size];
		x[0]=1;
		x[1]=2;
		x[2]=3;
		x[3]=4;
		x[4]=5;
		for(int i=0;i<5;i++) {
			x[i]=i+1;
		}
		for(int i=0;i<5;i++) {
			x[i]=(i+1)*3;
			System.out.println("x["+i+"]--->"+x[i]);//x[0]	
		}
		
		for(int i=0;i<5;i++) {
			if(x[i]%2==0) {
			System.out.println("x["+i+"]--->"+x[i]);//x[0]
			}
		}
		
		int b=10;
		double y[]= { 100,200};
		System.out.println(y[1]);
		
	}
}
