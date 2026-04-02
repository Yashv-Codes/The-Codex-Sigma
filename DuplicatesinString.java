public class DuplicatesinString {
    public static void removeDuplicates(String str, int idx, StringBuilder newstr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        if(map[currchar-'a']==true){ 
            // Duplicate
            removeDuplicates(str,idx+1,newstr,map);
        }
        else{
            // Mark and add
            map[currchar-'a'] = true;
            removeDuplicates(str,idx+1,newstr.append(currchar),map);
        }
    }

    public static void main(String[] args){
        String str = "aapnnaccollegge";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

    }
}


