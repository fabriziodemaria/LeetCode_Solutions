class Solution {
        List<String[]> solution = new LinkedList<String[]>();
    int[][] board;
    int n;
        public List<String[]> solveNQueens(int n) {
                if(n==1){
            String[] tmp = new String[1];
            tmp[0]=new String("Q");
            solution.add(tmp);
            return solution;
        }
        if(n<=3) return solution;
                this.n = n;
        board = new int[n][n];
        //initialize the board
        for(int r = 0; r<n; r++){
            for(int c = 0; c<n; c++){
                board[r][c] = 0;
            }
        }
                recur(0);
                return solution;
           }
        private void recur(int r){
                if(r==n){
            //we scanned correctly all the rows, so result is found
            addSolution(n);
            return;
        }
                for(int c = 0; c<n; c++){
                            board[r][c] = 1;
            if(checkPosition(r,c))
                recur(r+1);
            board[r][c] = 0;
                    }
    }
        private void addSolution(int n){
                String[] current = new String[n];
                for(int r = 0; r<n; r++){
            StringBuffer str = new StringBuffer("");
                        for(int c = 0; c<n; c++){
                if(board[r][c] == 0){
                    str.append(".");
                } else {
                    str.append("Q");
                }
            }
            current[r] = str.toString();
        }
                //create the solution
        solution.add(current);
            }
        private boolean checkPosition(int r, int c){
                int row = r-1;
        int col = c-1;
                //check row on the left
            while(row>=0){
                if(board[row][c]==1){
                    return false;
                }
                row--;
            }
                //check column above
            while(col>=0){
                if(board[r][col]==1){
                    return false;
                }
                col--;
            }
                    //check diagonal tp left
            row = r-1;
            col = c-1;
            while(row>=0 && col>=0){
                if(board[row][col]==1){
                    return false;
                }
                row--;
                col--;
            }
                    //check diagonal tp right
            row = r-1;
            col = c+1;
            while(row>=0 && col<n){
                if(board[row][col]==1){
                    return false;
                }
                row--;
                col++;
            }
        return true;            
    }
}
