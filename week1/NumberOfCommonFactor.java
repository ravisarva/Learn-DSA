//URL : https://leetcode.com/problems/number-of-common-factors/
public class NumberOfCommonFactor {
    public int commonFactors(int a, int b) {
        int min = a;
        if(a>b){
            min = b;
        }
        else min = a;
        int count = 0;
        for(int i = 1; i<= min ; i++){
            if(a%i == 0 && b%i == 0)
                count++;
        }
        return count;
    }
}
