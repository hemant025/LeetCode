class Solution {
    public int numIslands(char[][] grid) {

        int islands = 0;

        //Traverse every cell
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                // found unvisted land
                if(grid[row][col] == '1'){
                    islands++;  // new island discovered

                    // mark entire island visited
                    dfs(grid, row, col);
                }
            }
        }
        return islands;
    }
    private void dfs(char[][] grid, int row, int col){

        //Boundary check
        if(row < 0 ||
            row >= grid.length || 
            col < 0 || 
            col >= grid[0].length || 
            grid[row][col] == '0'){

            return;
        }

        //mark current land as visited
        grid[row][col] = '0';

        // explore all 4 direction
        dfs(grid, row+1, col);  //down
        dfs(grid, row - 1, col); // up
        dfs(grid, row, col + 1); // right
        dfs(grid, row, col - 1);  // left
    }
} 