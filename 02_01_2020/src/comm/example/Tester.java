package comm.example;

public class Tester {

	public static void main(String[] args) {
		Todo todo=new Todo(new Task(),new RandomFortuneSeervice());
		todo.createTodo("John", "Learning Angular", false);
		System.out.println(todo.getTodoDetails());
	}

}