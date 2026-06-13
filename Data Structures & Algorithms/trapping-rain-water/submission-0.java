class Solution {
    public int trap(int[] height) {
        int auxleft[] = new int [height.length];
        auxleft[0] = height[0];
         int auxright[] = new int [height.length];
         auxright[auxright.length - 1] = height[height.length-1];
        for (int i = 1; i < auxleft.length; i++){
            auxleft[i] = Math.max(auxleft[i-1] , height[i]);
        }
        for(int i = auxright.length-2 ; i >= 0; i-- ){
            auxright[i] = Math.max(auxright[i+1] , height[i]);
        }
        int tp = 0;
        for(int i = 0 ; i< height.length ; i++){
            int waterlevel = Math.min(auxright[i] , auxleft[i]);
            int p = waterlevel - height[i];
            tp += p;
        }
        return tp;
    }
}
