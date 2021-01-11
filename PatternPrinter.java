public class PatternPrinter {
    public static void print_pattern(int n) {
        for (int i = n; i > 0; i--) {
            int temp = n;
            for (int j = n; j > 0; j--) {
                if (i < n && i <= j) {
                    System.out.print(temp + " ");
                    temp--;
                } else
                    System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print_pattern(5);
    }
}
