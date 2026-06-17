class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxele = Integer.MIN_VALUE;
      for(int i = 0;  i< piles.length ; i++){
        maxele = Math.max(maxele , piles[i]);
      }
   
       int low = 1 ; int high = maxele;
        while(low<=high){
        int mid = (low + high ) / 2;     
        int totalhrs=0;
        for(int i = 0 ; i < piles.length;i++){
        totalhrs += (int)Math.ceil((double)piles[i] / mid);
        }   
         if(totalhrs <= h){
            high = mid-1;
         }
         else{
            low = mid+1;
         }
        }
   
      
      
     return low;
    }
}
