public class CountandCost {
    public static void main(String[] args) {
        int e, h, g;
        boolean solutionFound = false;

        for (e = 0; e <= 10; e++) {
            for (h = 0; h <= 33; h++) {
                g = 100 - e - h;
                if (g >= 0 && (10 * e + 3 * h + 0.5 * g == 100)&&(e!=0)&&(h!=0)&&(g!=0)) {
                    System.out.println("Elephant: " + e);
                    System.out.println("Horse: " + h);
                    System.out.println("Goat: " + g);
                    solutionFound = true;
                }
            }
        }

        if (!solutionFound) {
            System.out.println("No solution found.");
        }
    }
}
