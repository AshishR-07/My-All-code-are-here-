class Solution {
    public boolean isRobotBounded(String instructions) {
        int[][] dirs = {{0 , 1} , {1,0}  ,{0,-1} , { -1 , 0}} ;
        int dir = 0 ;
        int x = 0 ; 
        int y = 0 ;
        for ( int i = 0 ; i<instructions.length() ; i++){
            char ch = instructions.charAt(i) ;
            if ( ch == 'G'){
                x+= dirs[dir][0] ;
                y += dirs[dir][1] ;
            } 
            else if ( ch == 'R') {
                dir = (dir +1) % 4 ;}
            else if ( ch == 'L'){
                dir = (dir +3) % 4 ;
            } 
        }
        return (x == 0 && y ==0) ||( dir != 0) ;
    }
}