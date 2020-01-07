package Today;

public class Matrix {
	
	
		
		int a[][] = new int [3][3];
		int b[][]= new int [3][3];
		int c[][]= new int [3][3];
		
		
		
		public void Addmatrix (int a1[][] , int b1[][] )
		{
			this.a = a1;
			this.b=b1;
			
			
			for ( int i=0; i< a.length; i++)
			{
				for(int j =0 ; j< b.length ; j++)
				{
					c[i][j] = a[i][j]+b[i][j];
				}
				
			}
			for ( int i=0; i< a.length; i++)
				
			{
				System.out.print("\n");
				for(int j =0 ; j< b.length ; j++)
				{
					System.out.println(c[i][j] );
				}
				
			
		}
		
	

}
}
