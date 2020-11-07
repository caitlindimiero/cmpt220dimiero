import java.util.*;
import java.util.Scanner;
public class P2Module8 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); // To input scanner
        System.out.println("Enter the number of objects: ");
        int containerCount = input.nextLine();
        System.out.println("Enter the weights of the objects: ");
        
        String[] wgts = input.nextLine().split(" ");

        double[] object_weights = Arrays.stream(wgts).mapToDouble(Double::parseDouble).toArray();
    
        ArrayList<Container> containerShelf = new ArrayList<>();
        ArrayList<Item> items = new ArrayList<>();
    
        for (int i = 0; i < containerCount; i++) { // Add x amount of containers to the shelf
            containerShelf.add(new Container());
        }
    
        for (int i = 0; i < object_weights.length; i++) { // Add x amount of objects to the pile
            items.add(new Item(
                object_weights[i]
            ));
        }
    
        for (int i = 0; i < containerShelf.size(); i++) { // for each container on shelf
            Container container = containerShelf.get(i);

            System.out.println("[ Container " + (i + 1) + " ]");

            for (int i2 = 0; i2< items.size(); i2++) { // for each object in the pile
                Item item = items.get(i);

                if (item.weight < container.weightLeft) {
                    container.items.add(item); // add the object to the container

                    container.weightLeft -= item.weight; // Subtract the item from from container's weightLeft
                    items.remove(i);
                    System.out.println(item.weight);
                }
            }
        }

        System.out.println("Leftover items: " + items.size());
    }

}

class Container {
    public double weightLeft = 10.0;
    public ArrayList<Item> items;

    public Container() {
        items = new ArrayList<>();
    }
}
class Item {
    public double weight;

    public Item(double weight) {
        this.weight = weight;
    }
}