package LeetCode.Arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FindKthLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,88,77,66};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(findKthLargest(arr, 4));

    }
    public static int findKthLargest(int[] nums, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i : nums){
            minHeap.add(i);
            if(minHeap.size() > k){
                minHeap.remove();
            }
        }
        return minHeap.remove();
    }
}
