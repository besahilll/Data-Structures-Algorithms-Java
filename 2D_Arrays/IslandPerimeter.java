class IslandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        int no_of_islands=0,no_of_neighbors=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    no_of_islands++;
                    if((i-1>=0)&& grid[i-1][j]==1){
                        no_of_neighbors++;
                    }
                    if((j-1>=0)&& grid[i][j-1]==1){
                        no_of_neighbors++;
                    }
                }
            }
        }
        return (no_of_islands*4)-(no_of_neighbors*2);
    }

    public static void main(String[] args){
        int[][] grid={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(islandPerimeter(grid));
    }
}
