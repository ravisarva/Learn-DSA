//URL : https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1
public class AmstrongNumbers {
    static String armstrongNumber(int n){
        int number = n;
        int sum = 0;
        while(n > 0){
            int rem = n%10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
        if(sum == number) return "Yes";
        else return "No";
    }
}
