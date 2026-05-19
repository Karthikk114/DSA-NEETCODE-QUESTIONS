class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                Set<Character>set=new HashSet<>();
                for(int k=i;k<i+3;k++){
                    for(int l=j;l<j+3;l++){
                        if(set.contains(board[k][l])){
                            return false;
                        }
                        if(Character.isDigit(board[k][l])){
                            set.add(board[k][l]);
                        }
                    }
                }
                set.clear();   
            }
        }
        for(int i=0;i<9;i++){
            Set<Character>set=new HashSet<>();
            for(int j=0;j<9;j++){
                if(set.contains(board[i][j]))return false;
                if(Character.isDigit(board[i][j])){
                    set.add(board[i][j]);
                }
            }
        }
        for(int i=0;i<9;i++){
            Set<Character>set=new HashSet<>();
            for(int j=0;j<9;j++){
                if(set.contains(board[j][i]))return false;
                if(Character.isDigit(board[j][i])){
                    set.add(board[j][i]);
                }
            }
        }
        


        return true;
        
    }
}
