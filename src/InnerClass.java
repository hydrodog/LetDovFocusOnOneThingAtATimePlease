

public class InnerClass {


	private class B { // InnerClass$B

	}
	public InnerClass() {
		JButton b = new JButton("ok");
		ActionListener a = new ActionListener() 
			{ // InnerClass$1
				public void actionPerformed(ActionListener e) {
					System.out.println("hello");
				}
			};
		b.addActionListener(a);

		b.addActionListener(new ActionListener() // InnerClass$2 
			    {
			      	public void actionPerformed(ActionListener e) {
				        	System.out.println("hello");
				      }
			    } 
			);

	}


}
class A {
	class B { // A$B
	}
}
