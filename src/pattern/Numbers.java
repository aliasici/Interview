package pattern;

public class Numbers {

    public static void main(String[] args) {

        int i, j, k = 1;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j< i + 1; j++) {
                System.out.print(k++ + " ");
            }

            System.out.println();
        }

        System.out.println("+++++++++++++++++++");

        printNums(5);
    }

    public static void printNums(int n) {
        int i, j,num;

        for(i=0; i<n; i++){ // outer loop for rows

            num=1;
            for(j=0; j<=i; j++) {// inner loop for rows

                // printing num with a space
                System.out.print(num+ " ");

                //incrementing value of num
                num++;
            }

            // ending line after each row
            System.out.println();
        }
    }

}

