class nextGreaterElement {
    public int nextGreaterElement(int m) {
        long n = m;
        int count[] = new int[10];
        int currem = -1;
        int prevrem = -1;

        while(n>0)
        {
            currem = (int)n%10;
            n = n/10;
            count[currem]++;
            if(prevrem > currem)
            {
               int num = currem + 1;
               while(count[num]-- == 0)
               num++;
               n = (n*10) + num;

               for(int i =0;i<10;i++)
               {
                   while(count[i]-- > 0)
                   n = (n*10) + i;
               }
               return n>Integer.MAX_VALUE ?-1 : (int)n;
            }
            prevrem = currem;
        }
        return -1;
    }
}