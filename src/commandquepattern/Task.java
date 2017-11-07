package commandquepattern;

public class Task {
	private int id;
	
	public Task(int id) {
		this.id = id;
	}
	
	public void sovleProblem(){
		System.out.println("Solving the problem with id: "+id);
	}
}
