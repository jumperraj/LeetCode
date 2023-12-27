class Solution {
    int binary(int start,int end , double target, int[] potions,int s){
        int mid=(start+end)/2;
        // System.out.println("mid "+mid);
        if(start>=potions.length) return potions.length;
        if(end<0) return 0;
        // System.out.println(" potions "+potions[mid]);
        if((double)potions[mid]*s==target){
//             while(mid>0&&potions[mid]==potions[mid-1])mid--;

//  return mid;
if(mid>0&&!(potions[mid]==potions[mid-1])) return mid;
 }
        if(mid>0&&(double)potions[mid]*s>target && (double)potions[mid-1]*s<target) return mid;
        if((double)potions[mid]*s<target) return binary(mid+1,end,target,potions,s);
        return binary(start,mid-1,target,potions,s);
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        // for(int i : potions) System.out.print(" "+i);
        // System.out.println("");
        int[] arr = new int[spells.length];
        int t=0;
        // System.out.println("length "+potions.length);
        for(int i : spells){
            int j = binary(0,potions.length-1,success,potions,i);
            arr[t]=potions.length-j;
                        // System.out.println(t+" "+"tragte "+target+" res "+arr[t]+" j "+j);
            t++;
        }
        return arr;
    }
}