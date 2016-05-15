class Solution {
    public void setZeroes(int[][] matrix) {
                int j1;
        int i1;
                boolean xhas = false;
        boolean yhas = false;
                for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                //[i][j] j is column
                if(matrix[i][j]==0){
                    if(j==0) xhas =true;
                    if(i==0) yhas =true;
                    j1=j-1;
                    i1=i-1;
                    while(j1>=0){
                        if(i==0)break;
                        matrix[i][j1]=0;
                        j1--;
                    }
                    while(i1>=0){
                        if(j==0)break;
                        matrix[i1][j]=0;
                        i1--;
                    }
                }
            }
        }
                for(int j=1; j<matrix[0].length; j++){
                    if(matrix[0][j]==0){
                //set entire column at 0
                for(int i=1; i<matrix.length; i++){
                    matrix[i][j]=0;
                }
            }
                    }
                for(int i=1; i<matrix.length; i++){
            if(matrix[i][0]==0){
                //set entire row at 0
                for(int j=1; j<matrix[0].length; j++){
                    matrix[i][j]=0;
                }
            }
                    }
                if(xhas){
            for(int i=0; i<matrix.length; i++){
                matrix[i][0] = 0;
                            }
        }
         if(yhas){
            for(int j=0; j<matrix[0].length; j++){
                matrix[0][j] = 0;
                            }
        }
    }
}
