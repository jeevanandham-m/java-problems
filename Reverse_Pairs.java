import java.util.*;

class Reverse_Pairs {
    public int reversePairs(int[] arr) {
        return mergesort(arr, 0, arr.length - 1);
    }

    public int mergesort(int[] arr, int low, int high) {

        int cnt = 0;
        if (low >= high)
            return cnt;

        int mid = (low + high) / 2;
        cnt += mergesort(arr, low, mid);
        cnt += mergesort(arr, mid + 1, high);

        cnt += count(arr, low, mid, high);

        merge(arr, low, mid, high);
    
        return cnt;

    }

    public int count(int[] arr, int low, int mid, int high) {
        int right = mid + 1;

        int cnt = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high &&    (long) arr[i] > 2L * arr[right]) {
                right++;
            }
                cnt += right - (mid + 1);
            
        }

        return cnt;

    }

    public void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {

                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right++]);
            }
        }

        while (left <= mid) {
            temp.add(arr[left++]);
        }

        while (right <= high) {

            temp.add(arr[right++]);
        }

        for (int i = low; i <= high; i++) {

            arr[i] = temp.get(i - low);
        }
    }
}