package basic;

public class ExceptionalHandlingdemo {
	public static void main(String[] args)throws Exception {
		  int arr[]= {1,5,3,4,7};
		  
		  System.out.print(arr[0]);
		  System.out.print(arr[1]);
		  System.out.print(arr[2]);
		  System.out.print(arr[3]);
		  System.out.print(arr[4]);
		  try {
			  String s=null;
			  s.compareTo("");
			  System.out.print(arr[7]);//bad one 
		  }catch(NullPointerException exception) {
			   throw(exception);
			 // System.out.print("index is not avalbele plase provide proper index to get value"+exception);
		  }
		  catch(ArrayIndexOutOfBoundsException exception) {
			  System.out.print("index is not avalbele plase provide proper index to get value"+exception);
		  }
		  finally {
			  System.out.print("===alway work====");
		  }
		  System.out.print(arr[7]);
		  System.out.print(arr[4]);
	}
}
