class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        ArrayList<Boolean> kid = new ArrayList<Boolean>();
        int max =0;
        
        for (int i= 0; i < candies.length; i++){
            if(candies[i]> max){
                max = candies[i];
            }             
        }
        
        
        for (int i= 0; i < candies.length; i++){
            kid.add(i,(candies[i]+extraCandies)>= max);        
        }
        
        
        
        return kid;
}
}