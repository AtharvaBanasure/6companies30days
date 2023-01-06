import java.util.*;

class GoldmanSachQue01{
    public static int maxPoints(int[][] points) {

        int m = points.length;
        if (points.length == 1) {
            return 1;
        } else if (points.length == 2) {
            return 2;
        }
        int max = 0;

        for (int i = 0; i < m; i++) {
            HashMap<Double, Integer> map = new HashMap<>();
            for(int j = 0; j < m; j++) {
                if (i == j) {
                    continue;
                }
                int x1 = points[i][0];
                int x2 = points[j][0];
                int y1 = points[i][1];
                int y2 = points[j][1];
                // System.out.print(x1);
                // System.out.print(y1);
                // System.out.println();
                // System.out.print(x2);

                // System.out.print(y2);
                // System.out.println();
                double k = (double) (y2 - y1) / (double) (x2 - x1);

                map.put(k, map.getOrDefault(k, 1) + 1);

                max = Math.max(max, map.get(k));
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int points[][]={{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        System.out.println(maxPoints(points));
    }
}