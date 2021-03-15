import java.util.*;

public class FP01_Structured {



    public static void main(String[] args) {
        printAllNumbersInListStructured(Arrays.asList(2, 15, 36, 53, 27, 81, 12, 36, 54));
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {

        // How to loop the numbers?
        for(int number: numbers)
        {
            System.out.println(number);
        }

    }


}

