// package Assignment4.binaraySearch;

public class Program5 {

    int getPivot(int nums[]){
        int s = 0;
        int e = nums.length-1;
        int mid = s+(e-s)/2;

        while(s < e){
            if(nums[mid] >= nums[0]){
                s = mid+1;
            }
            else{
                e = mid;
            }

            mid = s+(e-s)/2;
        }
        return s;
    }

    int searchIndex(int []arr, int low, int high,int target){
        int mid = low+(high-low)/2;
        while(low <= high){
            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] < target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
            mid = low + (high-low)/2;
        }
        return -1;
    }
    public static void main(String[] args) {

        Program5 p = new Program5();

        int arr[] = {2,3,4,5,1};
        int target = 6;
        int n = arr.length;

        int pivot = p.getPivot(arr);

        if(arr[pivot] == target){
            System.out.println(pivot);
        }
        
        else if(arr[pivot] < target && arr[0] > target){
            System.out.println(p.searchIndex(arr, pivot, n-1, target));
        }
        else{
            System.out.println(p.searchIndex(arr, 0, pivot-1, target));
        }
    }
}
