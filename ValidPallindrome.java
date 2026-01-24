
public class ValidPallindrome {
    
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s = "rac1e1car";
        System.out.println("1st Case");
        System.out.println(isPalindrome(s));

        System.out.println("2nd Case");
        System.out.println(isPalindrome_BestCase(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").trim().toLowerCase();
        String g = new String();
        char[] chars = s.toCharArray();

        for(int i = chars.length-1; i>=0; i-- ){
            g = g.concat(String.valueOf(chars[i]));
        }

    return g.equals(s);    
    }


    public static boolean isPalindrome_BestCase (String s){
        s = s.replaceAll("[^a-zA-Z0-9]", "").trim().toLowerCase();

        int i = 0;
        int j = s.length()-1;
        while (i<=j) {
            if (s.charAt(i)==s.charAt(j)) {
                i++;
                j--;
            }
            else
                return false;
        } 
        return true;
    }

}
