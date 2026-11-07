import java.util.ArrayList;
import java.util.Collections;

class SortNumbers
{
    public static void main(String args[])
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(55);
        numbers.add(10);
        numbers.add(47);
        numbers.add(20);
        numbers.add(32);

        System.out.println("Before Sorting:");
        System.out.println(numbers);

        Collections.sort(numbers);

        System.out.println("After Sorting:");
        System.out.println(numbers);
    }
}
