class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> boxes = new HashMap<>();

        for(int i=0;i<9;i++){
            rows.put(i,new HashSet<>());
            cols.put(i,new HashSet<>());
            boxes.put(i,new HashSet<>());
        }

        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                char val = board[r][c];

                if(val == '.'){
                    continue;
                } 

                int boxIndex = (r/3)*3 + (c/3);
                if(rows.get(r).contains(val)||cols.get(c).contains(val)||boxes.get(boxIndex).contains(val)){
                    return false;
                }

                rows.get(r).add(val);
                cols.get(c).add(val);
                boxes.get(boxIndex).add(val);
            }
        }
        return true;
        
    }
}
