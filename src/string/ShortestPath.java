package string;

import java.sql.SQLOutput;

public class ShortestPath {
    public static float shortestPath(String path) {
        int X = 0;
        int Y = 0;
        for(int i=0; i<path.length(); i++) {
            char dir = path.charAt(i);

            if(dir == 'W') {
                Y--;
            } else if(dir == 'E') {
                Y++;
            } else if(dir == 'N') {
                X++;
            } else{
                X--;
            }
        }
        int X2 = X*X;
        int Y2 = Y*Y;
        return (float)Math.sqrt(X2+Y2);

    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(shortestPath(path));
    }
}
