package Today;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class Tochar {
	
	char[] a;
	int count ;
	{
		a = new char[100];
	}
	String st = "hello world";
	
	public char[] Stringconvert()
	{
	 for(int i = 0 ; i <st.length(); i++ )
	 {
		 a[i] = st.charAt(i);
		 
		 
	 }
	 return a;
	}
	 public void display()
	 {
		 for (int i = 0 ; i< a.length; i++)
			 
		 {
			 System.out.println(a[i] + " ");
		 }
	 }
	
 public int Vowel()
 { 
 
 
 
 
	 for(int i=0 ; i<a.length; i++)
	 {
		 if(a[i]== 'a'  || a[i]== 'e'  ||a[i]== 'i'  ||a[i]== 'o'  ||a[i]== 'u' ) 
				 {
		 
		 count++;
				 }
		 
	 }
		 return count;
 } 
	 
public void displaay()
{
	 System.out.println( count +"");
	 
	 
	 
	 
 }
}