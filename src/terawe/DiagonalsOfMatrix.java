package terawe;
public class DiagonalsOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},
                       {3,6,7,9},
                       {1,2,7,4},
                       {3,5,8,9}};
        printDiagonals(arr,4);
        System.out.println("+++++++++++++++++");
        secondDiagonals(arr, 4);

    }
    public static void printDiagonals(int[][] arr , int n){

        for (int i =0; i < n; i++){
            for (int j=0; j < n; j++){

                if(i == j ){
                    System.out.println(arr[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }

    public static void secondDiagonals(int[][] arr , int n){

        int k = n-1;

        for (int i =0; i < n; i++){

            System.out.println(arr[i][k] + " ");
            k--;
            System.out.print("");
            }

        }

}
