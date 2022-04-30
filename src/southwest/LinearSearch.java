package southwest;

public class LinearSearch {
    public static void main(String[] args) {

        //linear search = Iterate through a collection one lement at a time

        int[] arr = {9,1,8,2,3,6,4,5};

        int index = linearSearch(arr,6);

        if (index !=-1){
            System.out.println("Element found: "+index);
        }else{
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] arr, int value) {

        for(int i = 0; i <arr.length; i++){
            if(arr[i] == value){
                return i;
            }
        }
           return -1;

    }
}
