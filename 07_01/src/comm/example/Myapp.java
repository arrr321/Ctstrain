package comm.example;

import java.util.UUID;

public class Myapp {
public static void main(String[] args) {
	
	Task1 t1 = new Task1(UUID.randomUUID().toString(), "Janny" , "Arun" , true);
	Task1 t2 = new Task1(UUID.randomUUID().toString(), "Janny" , "Arun" , true);
	
	System.out.println(t1==t2);
	System.out.println(t1.equals(t2));
	
}
}
