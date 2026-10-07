public class TowerofHanoi {
    public static void Transfer_disks(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("Move disk " + n + " from " + src + " to " + dest);
            return;
        }
        // Move (n-1) disks from src to helper (dest acts as helper)
        Transfer_disks(n-1, src, dest, helper);

        System.out.println("Move disk " + n + " from " + src + " to " + dest);

        Transfer_disks(n-1, helper, src, dest);
    }
    
    public static void main(String[] args){
        Transfer_disks(3,"A","B","C");
    }
    
}
