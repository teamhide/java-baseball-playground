package study;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class CalculatorTest {
    private final Scanner sc = new Scanner(System.in);

    @Test
    void test() {
        String value = sc.nextLine();
        String[] values = value.split(" ");
        System.out.println("values = " + values);
    }
}
