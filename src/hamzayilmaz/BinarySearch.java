package hamzayilmaz;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {2,5,7,8,9,12,45,60};
        int index = binarySearch(array,60);

        System.out.println("index = " + index);


    }

    public static int binarySearch(int[] array , int num){

        int left = 0;
        int right = array.length-1;
        int mid = (left + right) / 2;

        while (left <= right){
            if (array[mid] < num){
                left = mid +1;

            }else if(array[mid] == num){
                return mid;
            }else if (array[mid] > num) {
                right = mid -1;
            }
            mid = (left + right) / 2;
        }

        return -1;

    }

    
}
