package comm.example;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Todo {
	private Task task;
	private String todoId;
	private LocalDate date;
	private boolean isCompleted;
	
	private static task tk;
	private static todo td;
	
	static 
	{
		tk = new Task();
		td = new Todo();
		
	}
static 
	
	
	
	

}