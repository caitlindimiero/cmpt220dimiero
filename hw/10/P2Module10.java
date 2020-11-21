public class P2Module10 {
    public static void main(String[] args) throws CloneNotSupportedException { // Main method given
        Animal[] list = new Animal[5];
        list[0] = new Chicken();
        list[0].setWeight(4.5);
        list[1] = new Tiger();
        list[1].setWeight(46.6);
        list[2] = new Chicken();
        list[2].setWeight(1.5);
        list[3] = (Animal)(list[0].clone());
        list[3].setWeight(7.5);
        list[4] = (Animal)(list[1].clone());
        java.util.Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
        System.out.println("weight: " + list[i].getWeight());
        }
        java.util.Arrays.sort(list);
        for(int i=0;i<list.length;i++){
            System.out.println("weight: "+list[i].getWeight());
        }
    }
}
class Tiger extends Animal{ 
}
class Chicken extends Animal{ 
}
class Animal implements Comparable<Animal>, Cloneable{ // implementation of comparable & cloneable interfaces
    private double w;
    public double getWeight() { // Getter method for weight
        return w;
    }
    public void setWeight(double w) { // Setter method for weight
        this.w = w;
    }
    @Override // Overriding of parent class- clone
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override 
    public int compareTo(Animal animal) { // Comparing of animals
        double WofAnimal= animal.getWeight();
        return (int)(this.getWeight()-WofAnimal);
    }
 }
