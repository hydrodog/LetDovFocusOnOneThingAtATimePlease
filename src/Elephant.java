public class Elephant {
	private String name;
		
	public Elephant(String name) { this.name = name;  }
  public String toString() {
		return "hello my name is " + name;
	}
		
	public static void main(String[] args) {
		Elephant e = new Elephant("Fred");
		System.out.println(e);

		Elephant e2 = new Elephant("Alice");
		System.out.println(e2);
	}
}
