import java.util.* ;
class Solution {
    public int[] dailyTemperatures(int[] t) {
        int arr [] = new int [t.length] ;
        Stack <Integer> stack = new Stack<>() ;

        for (int i = 0 ; i<t.length ;i++){
            while ( !stack.isEmpty() && t[i] > t[stack.peek()]){
                int id = stack.pop() ;
                arr[id] = i - id ;
            }
            stack.push(i) ;
        }
        return arr ;
    }
}

// import java.util.*;

// class Solution {
//     public int[] dailyTemperatures(int[] t) {

//         int[] arr = new int[t.length];
//         Stack<Integer> st = new Stack<>();

//         for (int i = 0; i < t.length; i++) {

//             while (!st.isEmpty() && t[i] > t[st.peek()]) {

//                 int index = st.pop();
//                 arr[index] = i - index;
//             }

//             st.push(i);
//         }

//         return arr;
//     }
// }