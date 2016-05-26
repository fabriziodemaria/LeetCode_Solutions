class Solution {
    public void solve(char[][] board) {
            for(int r = 0; r<board.length; r++){
            for(int c = 0; c<board[0].length; c++){
                if(r==0 || c==0 || r==board.length-1 || c==board[0].length-1){
                    //if here, we are at the border
                    if(board[r][c] == 'O'){
                        //if here, O at the border
                        if(board[r][c]=='O'){
                                                        //mark area as bad
                            board[r][c]='U';
                                                        //move from border (3 of the following will return immediately)
                            BFS(board, r+1,c);
                            BFS(board, r-1,c);
                            BFS(board, r,c+1);
                            BFS(board, r,c-1);
                        }
                    }
                }
            }
        }
        //coloring the temp results
        transformBoard(board,'O','X','U','O');
    }
            private void BFS(char[][] board, int r, int c){
                Queue<Integer> R = new LinkedList<Integer>();
        Queue<Integer> C = new LinkedList<Integer>();
        R.offer(r);
        C.offer(c);
                while(!R.isEmpty() && !C.isEmpty()){
            r = R.remove();
            c = C.remove();
                        //Termination conditions for the iterative scanning of the inner cells
            if(r<=-1 || c<=-1 || r>=board.length || c>=board[0].length) continue;
            if(board[r][c]=='U' || board[r][c]=='X') continue;
                    //mark reached cell as bad and iterate to the following ones
            if(board[r][c]=='O') {
                board[r][c]='U';
                R.offer(r+1);
                C.offer(c);
                R.offer(r-1);
                C.offer(c);
                R.offer(r);
                C.offer(c+1);
                R.offer(r);
                C.offer(c-1);
            }
        }
                    }
        //simple coloring function...
    private void transformBoard(char[][] board, char prev, char next, char prev2, char next2){
        for(int r = 0; r<board.length; r++){
            for(int c = 0; c<board[0].length; c++){
                if(board[r][c] == prev){
                    board[r][c] = next; 
                } else if(board[r][c] == prev2){
                    board[r][c] = next2;
                }
            }
        }
    }
}
