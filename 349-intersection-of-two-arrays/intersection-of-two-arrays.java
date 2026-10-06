import java.util.* ;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<> () ;
        Set<Integer> ans = new HashSet<>() ;
        for ( int n : nums1){
            set1.add(n) ;
        }
        for ( int x : nums2){
            if ( set1.contains(x)){
                ans.add(x);
            }
        }
        int [] result = new int[ans.size()] ;
        int i = 0 ;
        for ( int x: ans ){
            result[i] = x ;
            i++ ; 
        }
        return result ;}}