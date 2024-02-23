public class Pattern{
    public static void squareHollowPattern(int n){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if((i==0 || j==0 || i==n-1||j==n-1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void squareSolidPattern(int n){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void numberTriangelPattern(int n){
        int i,j;
        for(i=0;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void numberIncreasingPyramid(int n){
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void numberIncreasingReversePyramid(int n){
        int i,j;
        for(i=n-1;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        squareHollowPattern(10);
        squareSolidPattern(10);
        numberTriangelPattern(9);
        numberIncreasingPyramid(10);
        numberIncreasingReversePyramid(10);
    }
}