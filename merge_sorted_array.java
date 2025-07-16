// package Arrays;
import java.util.*;


class merge_sorted_array {
    public void merge(int[] arr1, int n, int[] arr2, int m) {
        int l = 0 , r = 0 , idx = 0;
        int arr3[] = new int[n+m]; 
         while(l<n && r<m){
            if(arr1[l] <= arr2[r]){
                arr3[idx++] = arr1[l++];

            }
            else{
                arr3[idx++] = arr2[r++];
            }
        }

        while(l<n){
            arr3[idx++] = arr1[l++];
        }
        while(r<m){
            arr3[idx++] = arr2[r++];
        }


        for(int i = 0 ; i< n + m  ; i++){
                 arr1[i] = arr3[i];
        }
    }
}