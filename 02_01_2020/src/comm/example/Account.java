package comm.example;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Account {
	
	private int Accountno;
	private String Acc_name ;
	private int Amount;
	private LocalDate DateofOpening;
	
	private static Account acc;
	
	
public static void Setvalue(int Accountno , String Acc_name , int Amount , LocalDate date) {
	
		
	
	
}

}
