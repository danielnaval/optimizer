
public class Player {
	private int salary;
	private int value;
	private Position position;
	
	public Player() {
		this.salary = 0;
		this.value = 0;
		this.position = null;
	}
	
	public Player(int salary, int value, Position position) {
		this.salary = salary;
		this.value = value;
		this.position = position;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public Position getPosition() {
		return position;
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}
}
