public class SpiralMatrix {
    public static void spiralMatrixPrint(int rowStart,int rowEnd,int colStart,int colEnd,int[][] arr){
        for(int i = rowStart;i <= colEnd;i++){
            System.out.print(arr[rowStart][i]+ " ");
        }
        rowStart++;
        for(int i = rowStart;i <=rowEnd;i++ ){
            System.out.print(arr[i][colEnd]+ " ");
        }
        colEnd--;
        for(int i = colEnd;i >= colStart;i--){
            System.out.print(arr[rowEnd][i]+ " ");
        }
        rowEnd--;
        if(rowStart < rowEnd){
            for (int i = rowEnd; i >= rowStart; i--) {
                System.out.print(arr[i][colStart] + " ");
            }
            colStart++;
        }
        
        if(rowStart <= rowEnd && colStart <= colEnd){
            spiralMatrixPrint(rowStart,rowEnd,colStart,colEnd,arr);
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{}};
        int rowStart = 0;
        int rowEnd = arr.length - 1;
        int colStart = 0;
        int colEnd = arr[0].length - 1;
        spiralMatrixPrint(rowStart,rowEnd,colStart,colEnd,arr);
    }
}

