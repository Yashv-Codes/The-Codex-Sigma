public class DuplicatesinString {
    public static void removeDuplicates(String str, int i, StringBuilder newstr, boolean map[]){
        if(i == str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(i);
        if(map[currchar-'a']==true){ 
            // Duplicate
            removeDuplicates(str,i+1,newstr,map);
        }
        else{
            // Mark and add
            map[currchar-'a'] = true;
            removeDuplicates(str,i+1,newstr.append(currchar),map);
        }
    }

    public static void main(String[] args){
        String str = "aapnnaccollegge";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

    }
}



