package Today;

public class MyArray {

	private char s[];
	{
		s=new char[26];
		
	}
	public char[] createArray()
	{
		for( int i=0 ; i <= s.length /2; i++)
		{
			s[i] = (char)('A'+i);
		}
		return s;
	}
	
	
	public void displayArray()
	{
	 for (int i=0 ; i <s.length/2 ; i++)
	 {
		 System.out.println(s[i] + ",");
	 }
	}
}
