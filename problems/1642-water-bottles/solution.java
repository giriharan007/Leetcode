class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int sum=numBottles;

        if(numBottles<numExchange)  return numBottles;
        while(numBottles>=numExchange){
             int rem=numBottles/numExchange;
             sum=sum+rem;
             int temp=numBottles%numExchange;
             numBottles=rem;
            numBottles+=temp; 
        }
        return sum;
    }
}
