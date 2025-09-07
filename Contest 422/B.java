import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] grid = new char[H][W];

        for (int i = 0; i < H; i++) {
            grid[i] = sc.next().toCharArray();
        }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        boolean valid = true;

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (grid[i][j] == '#') {
                    int count = 0;

                    for (int d = 0; d < 4; d++) {
                        int newRow = i + dx[d];
                        int newCol = j + dy[d];
                        if (newRow >= 0 && newRow < H && newCol >= 0 && newCol < W) {
                            if (grid[newRow][newCol] == '#') {
                                count++;
                            }
                        }
                    }

                    if (!(count == 2 || count == 4)) {
                        valid = false;
                        break;
                    }
                }
            }
            if (!valid) break;
        }

        System.out.println(valid ? "Yes" : "No");
    }
}
