public class Rat_in_Maze {
    public static boolean isSafe(int maze[][], int x, int y){
        if(x>=0 && x<maze.length && y>=0 && y<maze.length && maze[x][y]==1){
            return true;
        }
        return false;
    }

    public static boolean solveMaze(int maze[][], int x, int y, int sol[][]){
        if(x==maze.length-1 && y==maze.length-1 && maze[x][y]==1){
            sol[x][y] = 1;
            return true;
        }

        if(isSafe(maze, x, y) == true){
            // if(sol[x][y]==1){
                // return false;
            // }
            sol[x][y]=1;
            if(solveMaze(maze, x+1, y, sol)){
                return true;
            }
            if(solveMaze(maze, x, y+1, sol)){
                return true;
            }
            sol[x][y] = 0; // Backtracking
            return false;
        }
        return false;
    }

    public static void printSolution(int sol[][]){
        for(int i=0; i<sol.length; i++){
            for(int j = 0; j<sol.length; j++){
                System.out.print(" "+ sol[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int maze[][] = {{1, 0, 0, 0},
                        {1, 1, 1, 1},
                        {0, 0, 1, 0},
                        {1, 1, 1, 1}};
            
        int n = maze.length;
        int sol[][] = new int[n][n];
        if(solveMaze(maze, 0, 0, sol) == true){
            System.out.println("Solution exist : ");
            printSolution(sol);
        }else{
            System.out.println("Solution doen't exist : ");
        }
    }
}
