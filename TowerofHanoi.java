public class TowerofHanoi {
    public static void Transfer_disks(int n, String src, String helper, String dest){
        Transfer_disks(n-1, src, dest, helper);
        System.out.print("Move disk" + n + "from" + src + "to" + dest);
    }
    
}
