package sorting;

public class Substring {
    public static  String substring(String str, int si, int ei){
        String subStr = "";
        for(int i=si; i<ei; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.print(substring(str, 0, 4));
    }
}
