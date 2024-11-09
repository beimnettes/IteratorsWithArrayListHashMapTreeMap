import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        // Populate ArrayList with 10 random integers
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100)); // Random integers between 0 and 99
        }

        System.out.println("Original ArrayList: " + numbers);

        // Iteration using an Iterator
        Iterator<Integer> iterator = numbers.iterator();
        int sum = 0;

        while (iterator.hasNext()) {
            int num = iterator.next();
            System.out.println("Number: " + num);
            sum += num;
        }
        System.out.println("Total Sum: " + sum);

        // Attempt modification during iteration
        try {
            iterator = numbers.iterator(); // Reset iterator
            while (iterator.hasNext()) {
                int num = iterator.next();
                if (num % 2 == 0) {
                    iterator.remove(); // Safe removal
                }
            }
            System.out.println("After removing even numbers: " + numbers);

            // Attempt adding during iteration (this will throw ConcurrentModificationException)
            for (int i = 0; i < 5; i++) {
                numbers.add(50); // Unsafe modification
            }
        } catch (Exception e) {
            System.out.println("Exception caught during modification: " + e);
        }
    }
}
