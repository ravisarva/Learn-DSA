//URL: https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/1


class Compute {

    public int largest(int arr[], int n)
    {
        int max = arr[0];
        for(int i = 1; i<n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}