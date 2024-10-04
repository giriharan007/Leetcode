class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double out=0;
        for(int i=1;i<salary.length-1;i++){
                 out+=(double)salary[i];
        }
        return out/(salary.length-2);
    }
}
