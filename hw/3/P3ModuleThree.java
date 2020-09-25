public class P3ModuleThree {
    public static void main(String[] args) {
        final double r = 5; // To state radius as equal to five
        double x = (Math.random()); // To get random number
        double y = (Math.random());
        double d = (Math.sqrt( (x*x) + (y*y) ) - r );

        System.out.print( " The point is (" + x + "," + y + ") and its distance to the center is " + d ); // To give user answer

        System.out.print("\n");
        return ;
    }
}