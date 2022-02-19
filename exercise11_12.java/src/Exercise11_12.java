import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_12 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    var list = new ArrayList<Double>();

    System.out.println("Please enter 5 numbers:");
    for (int i = 0; i < 5; i++) {
      list.add(scan.nextDouble());
    }
    System.out.println("The sum is " + sum(list));
  }

  public static double sum(ArrayList<Double> list) {
    double sum = 0;
    for (double num : list) {
      sum += num;
    }
    return sum;
  }
}
