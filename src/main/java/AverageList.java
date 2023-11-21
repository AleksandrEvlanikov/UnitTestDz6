import java.util.Arrays;

public class AverageList {
    public double averageListAfremetic(String textNum1, String textNum2) {
        double[] splitArrayToDouble1 = Arrays.stream(textNum1.split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();
        double[] splitArrayToDouble2 = Arrays.stream(textNum2.split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        double averageList1 = Arrays.stream(splitArrayToDouble1).average()
                .orElse(0.0);
        double averageList2 = Arrays.stream(splitArrayToDouble2).average()
                .orElse(0.0);

        if (averageList1 > averageList2) {
            System.out.printf("Первый список = %.2f, больше чем 2 список = %.2f%n", averageList1, averageList2);
            return averageList1;
        } else if (averageList1 == averageList2) {
            System.out.printf("Первый список = %.2f, равен 2 списку = %.2f%n", averageList1, averageList2);
            return (averageList2 + averageList1) / 2;
        } else {
            System.out.printf("Второй список = %.2f, больше чем 1 список = %.2f%n", averageList2, averageList1);
            return averageList2;
        }
    }
}

