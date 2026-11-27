
public class IT26101727Lab7Q2A {
    public static void main(String[] args) {

        String[] symbols = {"$", "$", "$", "$", "$"};

        for (int i = 1; i <= 4; i++) {

            for (int j = 0; j < symbols.length; j++) {
                System.out.print(symbols[j] + " ");
            }

            System.out.println();
        }
    }
}
