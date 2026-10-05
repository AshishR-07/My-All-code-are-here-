class Solution {
    public int calPoints(String[] op) {
        int[] a = new int[op.length];
        int n = 0;
        for (String x : op) {
            if (x.equals("C")) 
                n--;
            else if (x.equals("D")) {
                a[n] = 2 * a[n - 1];
                n++ ;}
            else if (x.equals("+")) {
                a[n] = a[n - 1] + a[n - 2];
                n++;
            } 
            else {
                a[n] = Integer.parseInt(x);
                n++;
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += a[i];

        return sum;
    }
}