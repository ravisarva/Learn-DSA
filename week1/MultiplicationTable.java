URL: https://practice.geeksforgeeks.org/problems/print-table0303/1

class MultiplicationTable{
    static ArrayList<Integer> getTable(int N){
        // code here
        ArrayList<Integer> table = new ArrayList<>();
        for(int i =1 ; i<=10; i++){
            table.add(N*i);
        }
        return table;
    }
}