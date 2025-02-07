class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) { 
        Arrays.sort(boxTypes, (a,b) -> b[1]-a[1]); 
        int sum=0;
        for(int k=0;k<boxTypes.length;k++){
            int boxes=0;
            while(boxTypes[k][0]!=0 && truckSize!=0){
                     boxes=boxes+1;
                    boxTypes[k][0]-=1;
                    truckSize-=1;
            }
            sum=sum+(boxes*boxTypes[k][1]);
            if(truckSize==0){
                return sum;
            }
        }
        return sum;
    }
}
