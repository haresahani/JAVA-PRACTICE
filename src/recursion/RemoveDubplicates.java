package recursion;

public class RemoveDubplicates {
    public static void removeDup(String str, int idx, StringBuilder newStr, boolean map[]) {
        if(idx == str.length()){
            System.out.println(newStr.toString());
            return;
        }

        char currChar = str.charAt(idx);

        if(map[currChar-'a'] == true) {
            removeDup(str, idx+1, newStr, map);
        } else {
            map[currChar-'a'] = true;
            removeDup(str, idx+1, newStr.append(currChar), map);
        }
    }
}
