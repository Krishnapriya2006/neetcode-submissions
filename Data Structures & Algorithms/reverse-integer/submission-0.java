class Solution {
    public int reverse(int x) {
        int remainder=0;
        while(x!=0)
        {
            int a=x%10;
             if (remainder > Integer.MAX_VALUE / 10 || 
                remainder < Integer.MIN_VALUE / 10) {
                return 0;
            }
            remainder=remainder*10+a;
            x/=10;
        }
        return remainder;
    }
}
