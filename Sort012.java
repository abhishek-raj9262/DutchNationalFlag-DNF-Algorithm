package DutchNationalFlagDNFSortingAlgorithm;

import java.util.Arrays;

public class Sort012 {
    static void sort(int[] arr){
        int low=0;
        int mid=0;
        int high= arr.length-1;
        while (mid<=high){
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low]=temp;
                mid+=1;
                low+=1;
            } else if (arr[mid]==1) {
                mid+=1;
            } else if (arr[mid]==2) {
                int temp= arr[mid];
                arr[mid]= arr[high];
                arr[high]= temp;
                high-=1;
            }

        }
        //System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 0,1,1,0,1,2,1,2,0,0,0,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
