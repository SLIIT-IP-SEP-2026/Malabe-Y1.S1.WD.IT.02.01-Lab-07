public class IT26101727Lab7Q2B {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " - ");

            for (int j = 0; j < numbers[i]; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
