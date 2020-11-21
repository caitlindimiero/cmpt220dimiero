import java.math.BigInteger;
import java.util.Scanner;
public class P3Module10 {
    public static void main(String[] args) { // Main method
        Scanner input = new Scanner(System.in); // Input scanner for user input
        System.out.print("Enter the first rational number:"); // Get user input for first rational number
        int R1 = input.nextInt();
        System.out.print("Enter the second rational number:"); // Get user input for second rational number
        int R2 = input.nextInt();
        System.out.println("The sum of the rational numbers are" + (R1+R2)); // Give user answer
        input.close(); // Close scanner
    }
        public static class Rational extends Number implements Comparable<Rational> {
        /**
         *
         */
        private static final long serialVersionUID = 1L;
        private BigInteger num = ZERO;
        private BigInteger den = ONE;
        private static final BigInteger ONE = new BigInteger("1");
        private static final BigInteger NEG_ONE = new BigInteger("-1");
        private static final BigInteger ZERO = new BigInteger("0");
        public Rational() {
            this(ZERO, ONE);
        }
        public Rational(BigInteger num, BigInteger den) {
            BigInteger gcd = gcd(num, den);
            this.num = ((den.compareTo(ZERO) == 1) ? ONE : NEG_ONE).multiply(num).divide(gcd);
            this.den = den.abs().divide(gcd);
        }
        private BigInteger gcd(BigInteger n, BigInteger d) {
            BigInteger number1 = n.abs();
            BigInteger number2 = d.abs();
            BigInteger gcd = ONE;
            for (BigInteger k = ONE; (k.compareTo(number1) == -1 || k.equals(number1)) && (k.compareTo(number2) == -1 || k.equals(number2)); k = k.add(ONE)) {
             if (number1.remainder(k).equals(ZERO) && number2.remainder(k).equals(ZERO)) {
             gcd = k;
         }
    }
        return gcd;
        }
        public BigInteger getnum() {
            return num;
        }
        public BigInteger getden() {
            return den;
        }
        public Rational add(Rational Rational2) {
            BigInteger n = (num.multiply(Rational2.getden()))
                    .add((den.multiply(Rational2.getnum())));
            BigInteger d = den.multiply(Rational2.getden());
            return new Rational(n, d);
        }
        public Rational subtract(Rational Rational2) {
            BigInteger n = (num.multiply(Rational2.getden()))
                    .subtract((den.multiply(Rational2.getnum())));
            BigInteger d = den.multiply(Rational2.getden());
            return new Rational(n, d);
        }
        public Rational multiply(Rational Rational2) {
            BigInteger n = num.multiply(Rational2.getnum());
            BigInteger d = den.multiply(Rational2.getden());
            return new Rational(n, d);
        }
        public Rational divide(Rational Rational2) {
            BigInteger n = num.multiply(Rational2.getden());
            BigInteger d = den.multiply(Rational2.getnum());
            return new Rational(n, d);
        }
        @Override
        public String toString() {
            if (den.equals(ONE)) {
                return num + "";
            } else {
                return num + "/" + den;
            }
        }
        @Override
        public boolean equals(Object other) {
            if ((this.subtract((Rational) (other))).getnum().equals(ZERO)) {
                return true;
            }
            return false;
        }
        @Override
        public int intValue() {
            return (int) doubleValue();
        }
        @Override
        public float floatValue() {
            return (float) doubleValue();
        }
        @Override
        public double doubleValue() {
            return num.doubleValue() / den.doubleValue();
        }
        @Override
        public long longValue() {
            return (long) doubleValue();
        }
        @Override
        public int compareTo(Rational o) {
            if (this.subtract(o).getnum().compareTo(ZERO) == 1) {
                return 1;
            } else if (this.subtract(o).getnum().compareTo(ZERO) == -1) {
                return -1;
            }
            return 0;
        }
    }
 }
