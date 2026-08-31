class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>>rows = new HashMap<>();
        Map<Integer, Set<Character>>cols = new HashMap<>();
        Map<String, Set<Character>>sqrs = new HashMap<>();


        for(int i = 0;i < 9;i++){
            for(int j = 0;j < 9;j++){
                if(board[i][j] == '.'){
                    continue;
                }
                String sqrKey = (i / 3) + "," + (j / 3);

                if(rows.computeIfAbsent(i, k -> new HashSet<>()).contains(board[i][j])||
                cols.computeIfAbsent(j, k-> new HashSet<>()).contains(board[i][j]) ||
                sqrs.computeIfAbsent(sqrKey, k-> new HashSet<>()).contains(board[i][j])){
                    return false;
                }
            
                rows.get(i).add(board[i][j]);
                cols.get(j).add(board[i][j]);
                sqrs.get(sqrKey).add(board[i][j]);
            }
        }
        return true;
    }
}
