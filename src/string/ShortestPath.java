package string;

public class ShortestPath {
    public static float shortestPath(String str) {
        int x = 0;
        int y = 0;

        for(int i=0; i<str.length(); i++) {
            char dir = str.charAt(i);
            //West
            if(dir == 'W') {
                y--;
            }
            //North
            else if(dir == 'N') {
               x++;
            }
            //East
            else if(dir == 'E') {
                y++;
            }
            //South
            else {
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;

        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.print(shortestPath(str));
    }
}
