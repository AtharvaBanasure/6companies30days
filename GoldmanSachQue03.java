class GoldmanSachQue03{
    
    
    public static int trailingZeroes(int n) {
        
        int ans=0;
       while(n>=5)
       {
           n/=5;
           ans+=n;
       }
        
        return ans;
    }
    public static void main(String[] args) {
        int n=15;
        System.out.println(trailingZeroes(n));
    }
}