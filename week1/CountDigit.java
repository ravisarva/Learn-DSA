//URL : https://practice.geeksforgeeks.org/problems/count-digits5716/1
public class CountDigit {
    static int evenlyDivides(int N) {
        int count = 0;
        int N1 = N;
        while (N != 0) {
            int rem = N % 10;
            if (rem != 0 && N1 % rem == 0) {
                count++;
            }
            N = N / 10;
        }
        return count;
    }
}
