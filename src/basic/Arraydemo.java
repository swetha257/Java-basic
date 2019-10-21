package basic;

public class Arraydemo {
	public static void main(String[] args) {
		int a=5;
		int x[][]= new int [a][2];//// data variable declartion =new datatype[size];
		x[0][0]=1;
		x[1][0]=2;
		x[2][0]=3;
		x[3][0]=4;
		x[4][0]=5;
		for(int i=0;i<5;i++) {
			for(int j=0;j<2;j++) {
				x[i][j]=j;
				System.out.println(x[i][j]);
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(x[i][j]);
			}
		}
	}

}
