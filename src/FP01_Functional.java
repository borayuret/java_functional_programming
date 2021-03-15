import java.util.Arrays;
import java.util.List;

public class FP01_Functional {



    public static void main(String[] args) {
        printAllNumbersInListFunctional(Arrays.asList(2, 15, 36, 53, 27, 81, 12, 36, 54));
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {

        numbers.stream()
                .forEach(FP01_Functional::print); //Method reference

    }

    private static void print(int number)
    {
        System.out.println(number);
    }


}

