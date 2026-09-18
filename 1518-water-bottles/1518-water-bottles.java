class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int a = numBottles;
        while(numBottles >= numExchange){
            int newBottles = numBottles / numExchange;
            int remBottles=numBottles % numExchange;
            a = a +newBottles;
            numBottles = newBottles + remBottles; 
        }
        return a;
        
    }
}