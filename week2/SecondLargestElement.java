//URL: https://practice.geeksforgeeks.org/problems/second-largest3735/1
public class SecondLargestElement {
    int print2largest(int arr[], int n) {
        // code here
        int max = arr[0];
        int ans = -1;

        for(int i = 0; i<n; i++){
            if(max < arr[i]){
                if(max > ans){
                    ans = max;
                }
                max = arr[i];
            }
            else if(max > arr[i] && arr[i]> ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}