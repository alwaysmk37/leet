class leet342 {
    public boolean isPowerOfFour(int n) {
        if(n<1){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%4==0){
            return isPowerOfFour(n/4);
        }
        return false;

    }

    public static void main(String[] args) {
        leet342 s1= new leet342();
        System.out.println(s1.isPowerOfFour(6));
    }
}