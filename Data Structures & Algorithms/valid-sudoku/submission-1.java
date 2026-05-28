class Solution {
    public boolean isValidSudoku(char[][] board) {

        if(board.length < 1){
            return false;
        }
        Map<Integer,Set<Character>>rows = new HashMap<>();
        Map<Integer,Set<Character>>cols = new HashMap<>();
        Map<String,Set<Character>>sqrs = new HashMap<>();

        for(int r = 0;r < board.length;r++){
            for(int c = 0;c < board.length;c++){
                char num = board[r][c];
                if(num == '.'){
                    continue;
                }

                String squareKey = (r/3) + "," + (c/3);

                if(rows.computeIfAbsent(r,k -> new HashSet<>()).contains(num)||
                cols.computeIfAbsent(c,k -> new HashSet<>()).contains(num)||
                sqrs.computeIfAbsent(squareKey,k -> new HashSet<>()).contains(num)){
                    return false;
                }

                rows.get(r).add(num);
                cols.get(c).add(num);
                sqrs.get(squareKey).add(num);

            }
        }

        return true;
    }
}
