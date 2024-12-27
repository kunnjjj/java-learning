import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // 1. Standard Declaration
        ArrayList<Integer> standardList = new ArrayList<>();
        standardList.add(10);
        standardList.add(20);
        System.out.println("Standard ArrayList: " + standardList);

        // 2. Using List Interface
        List<Integer> listInterface = new ArrayList<>();
        listInterface.add(30);
        listInterface.add(40);
        System.out.println("List declared using interface: " + listInterface);

        // 3. With Initial Capacity
        ArrayList<Integer> capacityList = new ArrayList<>(5);
        capacityList.add(50);
        capacityList.add(60);
        System.out.println("ArrayList with initial capacity: " + capacityList);

        // 4. Direct Initialization using Arrays.asList
        List<Integer> initializedList = new ArrayList<>(Arrays.asList(70, 80, 90));
        initializedList.add(100); // Fully mutable
        System.out.println("ArrayList initialized with Arrays.asList: " + initializedList);

        // 5. Immutable List using Collections.singletonList
        List<Integer> singletonList = Collections.singletonList(110);
        System.out.println("Immutable singleton list: " + singletonList);

        // 6. Using List.of (Java 9+)
        List<Integer> immutableList = List.of(120, 130, 140);
        System.out.println("Immutable list using List.of: " + immutableList);

        // 7. Using Stream API
        List<Integer> streamList = IntStream.range(1, 6) // Generates numbers 1 to 5
                .boxed() // Converts int to Integer
                .collect(Collectors.toList());
        System.out.println("List created using Stream API: " + streamList);

        // Performing common operations on an ArrayList
        ArrayList<Integer> operationsList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("\nOriginal List: " + operationsList);

        // Add an element
        operationsList.add(6);
        System.out.println("After adding 6: " + operationsList);

        // Remove an element
        operationsList.remove(Integer.valueOf(3)); // Removes the element "3"
        System.out.println("After removing 3: " + operationsList);

        // Update an element
        operationsList.set(2, 10); // Update index 2 to value 10
        System.out.println("After updating index 2 to 10: " + operationsList);

        // Check if an element exists
        boolean containsFive = operationsList.contains(5);
        System.out.println("Does the list contain 5? " + containsFive);

        // Size of the list
        int size = operationsList.size();
        System.out.println("Size of the list: " + size);

        // Clear the list
        // operationsList.clear();
        // System.out.println("After clearing the list: " + operationsList);

        printUsingIterator(operationsList);

        printForEach(standardList);
    }

    private static void printUsingIterator(List<Integer> list)
    {
        Iterator<Integer> iterator=list.iterator();
        System.out.println("using iterator");

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("exiting");
    }


    private static void printForEach(List<Integer> list)
    {
        System.out.println("using for Each");

        for(int element:list)
        {
            System.out.println(element);
        }
        System.out.println("exiting");
    }
}
