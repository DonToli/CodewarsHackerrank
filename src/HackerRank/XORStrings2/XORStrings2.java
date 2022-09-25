package HackerRank.XORStrings2;

public class XORStrings2 {
    public static void main(String[] args) {
        System.out.println(XORStrings2("10000","00101"));
    }
    public static String XORStrings2(String s,String t){
        String res = new String("");
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==t.charAt(i))
                res = res + "0";
            else
                res = res + "1";

        }
        return res;
    }

}
