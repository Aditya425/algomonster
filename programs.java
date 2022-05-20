import java.util.*;

class Programs {
    public static void main(String[] args) {
        int[][] roads = new int[][] {{0,1},{1,2},{2,3},{2,4},{5,6},{5,7}};
        int n = 8;
        System.out.println(maximalNetworkRank(n, roads));
    }

    static int maximalNetworkRank(int n, int[][] roads) {
        int rank = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int count = 0;
                for (int[] road : roads) {
                    if (road[0] == i || road[0] == j || road[1] == i || road[1] == j) {
                        count++;
                    }
                }
                rank = Math.max(rank, count);
            }
        }

        return rank;
    }
}