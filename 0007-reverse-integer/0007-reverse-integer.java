class Solution {
    public int reverse(int x) {
        int result = 0;
        while (x !=0)
        {
            int tail = x%10;
            int result2 = result*10 + tail;
            if ((result2-tail)/10 !=result)
            {return 0;}
            result = result2;
            x=x/10;
            
        }
        return result;
    }
}