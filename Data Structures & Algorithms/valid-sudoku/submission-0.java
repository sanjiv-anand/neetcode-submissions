class Solution {
    public boolean isValidSudoku(char[][] board) {
       HashSet<String> seen = new HashSet<>();
       for(int row = 0; row < 9; row++){
            for(int col = 0; col<9; col++){
                char num = board[row][col];
                if(num == '.'){
                    continue;
                }
                String rowkey = num + " in row " + row;
                String colkey = num + " in col " + col;
                String boxkey = num + " in box " + ((row/3)*3 + col/3);

                if(!seen.add(rowkey)|| !seen.add(colkey)|| !seen.add(boxkey)){
                    return false;
                }
            }
       } 
       return true;
    }
}
