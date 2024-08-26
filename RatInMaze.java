import java.util.*;

public class RatInMaze {
    private static int countPaths = 0;


    private static boolean isSafe(int[][] maze, int x, int y, boolean[][] visited) {
        return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1 && !visited[x][y]);
    }

    private static void solveMaze(int[][] maze, int x, int y, boolean[][] visited) {
        int N = maze.length;

        if (x == N - 1 && y == N - 1) {
            countPaths++;
            return;
        }

        visited[x][y] = true;

        if (isSafe(maze, x + 1, y, visited)) {
            solveMaze(maze, x + 1, y, visited);
        }

        if (isSafe(maze, x, y + 1, visited)) {
            solveMaze(maze, x, y + 1, visited);
        }

        if (isSafe(maze, x - 1, y, visited)) {
            solveMaze(maze, x - 1, y, visited);
        }

        if (isSafe(maze, x, y - 1, visited)) {
            solveMaze(maze, x, y - 1, visited);
        }

        visited[x][y] = false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] maze = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        boolean[][] visited = new boolean[N][N];
        solveMaze(maze, 0, 0, visited);

        System.out.println(countPaths);
    }
}