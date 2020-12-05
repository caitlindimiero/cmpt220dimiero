import java.util.ArrayList;
import java.util.Scanner;
public class P2Module11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // To input scanner
        System.out.println("Enter the number of items: "); // Get user input for num of items
        int itemCount = input.nextInt();
        double[] weights = new double[itemCount];
        System.out.println("Enter the weights for each item: "); // Get user input for weights for each item
        for (int i = 0; i < itemCount; i++) {
            weights[i] = input.nextDouble();
        }
        System.out.println("Enter the weight limit for the bag: "); // Get user input for weight limit
        int weightLimit = input.nextInt();
        ArrayList<Integer> bag = m(itemCount, weightLimit, weights);
        int sum = 0;
        String weightsOfItems = "";
        String itemsInBag = "";
        for (Integer itemWeight : bag) {
            sum += itemWeight;
            for(int i = 0; i < weights.length; i++)
                if (weights[i] == itemWeight)
                    itemsInBag += String.format("#%s ", (i+1));
            weightsOfItems += String.format("%s ", itemWeight);
        }
        System.out.println("The maximum weight for the items placed in the bag is " + sum); // Give user answer
        System.out.println("The items in the bag are " + itemsInBag);
        System.out.println("The weights of the items in the bag are " + weightsOfItems);
        input.close(); // To close scanner
    }
    public static ArrayList<Integer> m(int i, double weightLimit, double[] w) {
        ArrayList<Integer> itemsThatFit = new ArrayList<Integer>();
        // return empty if the itemcount or weightLimit 0
        if (i <= 0) return new ArrayList<Integer>(); // m(0, weightLimit) = 0;
        if (weightLimit <= 0) return new ArrayList<Integer>(); // m(i, 0) = 0;
        // if the weight of the current item (i) is greater than 
        // weightLimit, check the next item's (recurse).
        // m(i,w) = m(i-1, weightLimit); if w1 > weightLimit
        if (w[i-1] > weightLimit) {
            return m(i-1, weightLimit, w);
        }
        // return the greater number between the next item's weight or the weight of
        // the next item taking into account the current item's weight in the knapsack
        // (the remaining weight in the knapsack becomes the new `weightLimit`)
        // m(i,w) = max(m(i - 1, weightLimit), w1 + m(i - 1, weightLimit - w1));
        itemsThatFit.add(
            (int)w[i-1]
        );
        itemsThatFit.addAll(
            m(i-1, weightLimit - w[i-1], w)
        );
        return itemsThatFit;
    }
}

