class leet3310 {
    public static int scoreOfString(String s) {
        int diff=0,score=0;
        for(int i=0;i<s.length()-1;i++){
            diff=Math.abs(s.charAt(i)-s.charAt(i+1));
            score+=diff;
        }
        return score;
    }
    public static void main(String args[])
    {
        System.out.println(scoreOfString("zaz"));
    }
}