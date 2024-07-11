public class ArrMidEx {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		int[] n= {3,5,6,8,11,13,18};
		if(n.length%2==0) {
			int x=n[(n.length/2)-1];
			System.out.println("the mid element: "+ x);
			int y=n[n.length/2];
			System.out.println("the mid element: "+ y);
		
		}
		else {
			int z=n[n.length/2];
			System.out.println("the mid element: "+ z);
		}
			
	
	}

}