public class leet1108 {
    public String ipadd(String add){
        return add.replace(".","[.]");
    }

    public static void main(String[] args) {
        leet1108 s = new leet1108();
        System.out.println(s.ipadd("17.17.52.244"));
    }
}
