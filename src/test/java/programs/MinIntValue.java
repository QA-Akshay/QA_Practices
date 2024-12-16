package programs;

public class MinIntValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {23,454,54,7,89};
		int min=a[0];
		
		for (int i=1;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("Min no is="+min);
	}
}