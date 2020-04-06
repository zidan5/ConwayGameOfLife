public class Conway {

    public static void main(String[] args){

        int Col = 10; int Row = 10;
        int[][] grid = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };

        for (int i= 0; i < Col; i++){
            System.out.println();
            for(int j=0; j < Row; j++){
                // System.out.print(grid[i][j]+" ");
                if(grid[i][j] == 0){
                    System.out.print(" + ");
                }else{
                    System.out.print(" # ");
                }
            }
        }
        System.out.println();

        nextGeneration(grid,Col,Row);

    }
    static void nextGeneration(int grid[][], int Col, int Row)
    {
        int[][] future = new int[Col][Row];

        // Loop through every cell
        for (int l = 1; l < Col - 1; l++)
        {
            for (int m = 1; m < Row - 1; m++)
            {
                // getting all neighbours that are alive
                int aliveNeighbours = 0;
                for (int i = -1; i <= 1; i++)
                    for (int j = -1; j <= 1; j++)
                        aliveNeighbours += grid[l + i][m + j];

                //he cell needs to be subtracted from its neighbours as it was counted before
                aliveNeighbours -= grid[l][m];

                // Implementing the Rules of Life

                // Cell dies due to underpopulation
                if ((grid[l][m] == 1) && (aliveNeighbours < 2))
                    future[l][m] = 0;

                    // Cell dies due to over population
                else if ((grid[l][m] == 1) && (aliveNeighbours > 3))
                    future[l][m] = 0;

                    // Creating a new cell
                else if ((grid[l][m] == 0) && (aliveNeighbours == 3))
                    future[l][m] = 1;

                    // Cell remains unchanged
                else
                    future[l][m] = grid[l][m];
            }
        }

        System.out.println("Next Generation");
        for (int i = 0; i < Col; i++)
        {
            for (int j = 0; j < Row; j++)
            {
                if (future[i][j] == 0)
                    System.out.print(" + ");
                else
                    System.out.print(" # ");
            }
            System.out.println();
        }
    }
}


