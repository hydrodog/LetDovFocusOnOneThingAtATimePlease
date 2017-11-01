public class Complex {
	private double r, i;
	public Complex(double r, double i) {
		this.r = r; this.i = i;
	}
	public Complex(double r) {
		this(r, 0);
	}
	public Complex() {
		this(0,0);
	}
	public Complex add(Complex b) {
		return new Complex(r + b.r, i + b.i);
	}
	public Complex mult(Complex b) {
		return new Complex(r * b.r - i * b.i, r * b.i + i * b.r);
	}
	public double abs() {
		return Math.sqrt(r*r - i*i);
	}
	public double getReal() { return r; }
	public void setReal(double r) { this.r = r; }
	public double getImag() { return i; }
	public void setImag(double i) { this.i = i; }
	public String toString() {
		return r + "+" + i + "i";
	}
	
	public static void main(String[] args) {
		Complex c1 = new Complex(1.0, 1.5);
		Complex c2 = new Complex(2.0, 1.0);
		Complex c3 = c1.add(c2);
		Complex c4 = c1.mult(c2);
		System.out.println(c4);
		System.out.println("absolute value of z=" + c4.abs());
		Complex c5 = new Complex(4.0);
		Complex c6 = new Complex();
		c6.setReal(2.2);
		c6.setImag(0.5);
	}
}
