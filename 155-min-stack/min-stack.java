class MinStack {
            Stack<Integer> values ;
             Stack<Integer> mins;
    public MinStack() {
   values = new Stack<>() ;
      mins  = new Stack <>() ;
    }
    
    public void push(int value) {
        values.push(value);
        if ( mins.isEmpty() || value <= mins.peek())
           mins.push(value);
           else{
            mins.push(mins.peek());
           }
    }
    
    public void pop() {
        if (!values.isEmpty()){
                values.pop() ;
                mins.pop() ;
        }
    }
    
    public int top() {
        return   values.peek();
        
    }
    
    public int getMin() {
        return mins.peek() ;
    }
}