import java.time.LocalDate;
import java.time.LocalDateTime;

public class test {
  public static void main(String[] args) {
	  test t = new test();
	 System.out.println("hello");
	 System.out.println(Math.random());
	 System.out.println(LocalDateTime.now());
	 
	 for( int i=1 ; i<= 9 ; i++)
	 {
		  for(int j=1 ; j <i ; j++)
		 {
			 System.out.print("-");
		 }
			 System.out.println();

	 }
}

}