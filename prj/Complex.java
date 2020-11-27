public class Complex implements Cloneable { // Extension of number class
  private double a;
  private double b;
  public Complex() { // three constr. asked for
    this(0, 0);
  }
  public Complex(double a) {
    this(a, 0);
  }
  public Complex(double a, double b) {
    this.a = a;
    this.b = b;
  }
  public double getRealPart() { // getRealPart method
    return a;
  }
  public double getImaginaryPart() { // getImaginaryPart method
    return b;
  }
  public Complex add(Complex c) { // Complexnum Addition
    double real = (a + c.getRealPart());
    double imaginary = (b + c.getImaginaryPart());
    return new Complex(real, imaginary);
  }
  public Complex subtract(Complex c) { // Complexnum Subtraction
    double real = (a - c.getRealPart());
    double imaginary = (b - c.getImaginaryPart());
    return new Complex(real, imaginary);
  }
  public Complex multiply(Complex c) { // Complexnum Multiplication
    double real = (a * c.getRealPart()) - (b * c.getImaginaryPart());
    double imaginary = (b * c.getRealPart()) + (a * c.getImaginaryPart());
    return new Complex(real, imaginary);
  }
  public Complex divide(Complex c) { // Complexnum Division
    double real = (a * c.getRealPart() + b * c.getImaginaryPart()) /
      (c.getRealPart() * c.getRealPart() +
       c.getImaginaryPart() * c.getImaginaryPart());
    double imaginary = (b * c.getRealPart() - a * c.getImaginaryPart()) /
      (c.getRealPart() * c.getRealPart() +
       c.getImaginaryPart() * c.getImaginaryPart());
    return new Complex(real, imaginary);
  }
  public double abs() { // Absolute value of complexnums
    return Math.sqrt(a * a + b * b);
  }
  @Override // override of protected string method  
  public String toString() {
    if (b > 0 || b < 0) { // Returns a + bi as a string
      return a + " + " + b + "i";
    }
    return a + ""; // Returns b is 0, it returns a
  }
  @Override // override of protected clone method
  public Object clone() throws CloneNotSupportedException {
    return (Complex)super.clone();
  }
}
    

