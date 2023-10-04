//URL: https://practice.geeksforgeeks.org/problems/prime-number2314/1

class isPrimeNumber{
    static int isPrime(int N){
        int count =0;
        for(int i = 2; i*i< N +1; i++){
            if(N%i == 0){
                return 0;
            }
        }
        if(N == 1){
            return 0;
        }
        else return 1;
    }
