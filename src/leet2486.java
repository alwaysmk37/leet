class leet2486 {
    public int appendCharacters(String s, String t) {
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                j++;
            }
            i++;
        }
        return t.length()-j;
    }
    public static void main(String[] args) {
        leet2486 solution = new leet2486();
        String s1 = "coaching";
        String t1 = "coding";
        System.out.println(solution.appendCharacters(s1, t1));
    }
}