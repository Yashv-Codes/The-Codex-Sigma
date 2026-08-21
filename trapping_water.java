public class trapping_water {
    public static int trapped_water(int height[]){
        int n = height.length;
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        int trapped_water = 0;
        int width = 1;
        for(int i=0; i<n; i++){
            int water_lvl = Math.min(leftmax[i], rightmax[i]);
            trapped_water += (water_lvl - height[i])*width;
        }
        return trapped_water;
    }

    public static void main(String[] args){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Total water trapped = "+(trapped_water(height)));
    }
}




