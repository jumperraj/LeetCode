class Solution {
   boolean solve(char board[][],String word,int ind,boolean[][] v,int i,int j){
        
        if(j<0 || i<0 || j>=board[0].length || i>=board.length|| v[i][j]) return false;
        if(board[i][j]==word.charAt(ind)){
            if(ind==word.length()-1) { 
                // System.out.println(" "+word.charAt(ind)+" ind "+ind+" i "+i+" j "+j); 
                return true;}
            v[i][j]=true;
            // System.out.println(" "+word.charAt(ind)+" ind "+ind+" i "+i+" j "+j);
            if(solve(board,word,ind+1,v,i+1,j)||solve(board,word,ind+1,v,i,j+1)||solve(board,word,ind+1,v,i-1,j)||solve(board,word,ind+1,v,i,j-1)) {v[i][j]=false;return true;}
            v[i][j]=false;
            
            // solve(board,word,ind+1,v,i-1,j);
            // solve(board,word,ind+1,v,i,j-1);
        }
        // if(ind ==0 && board[i][j]!=word.charAt(ind)){
        //     if(solve(board,word,ind,v,i+1,j)||solve(board,word,ind,v,i,j+1)||solve(board,word,ind,v,i-1,j)||solve(board,word,ind,v,i,j-1)) {return true;}
        // }   
        
        return false;
    }
    public boolean exist(char[][] board, String word) {
        boolean v[][] = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j =0 ;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(solve(board,word,0,v,i,j)) return true;
                }
                
            }
        }
       return  false;
    }
}