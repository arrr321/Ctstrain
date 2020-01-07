package Today;

public class Myclass {

public long add(int... a)
{
	int result = 0;
	for (int i :a)
	{
		result = result+i;
	}
	return result;
}
public String add (String str , int c , int b)
{
	return str+(c+b) ; 
}
}
