class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;

        while (i < j){
    
            System.out.println(i + ":" + j);
            System.out.println(s.charAt(i) + ":" + s.charAt(j));
            while ( i< j && !Character.isLetterOrDigit(s.charAt(i)) ){
                i += 1;
            }

            while ( i< j && !Character.isLetterOrDigit(s.charAt(j)) ){
                j -= 1;
            }

        

            System.out.println(i + ":" + j);
            char startChar = Character.toLowerCase(s.charAt(i));
            char endChar = Character.toLowerCase(s.charAt(j));
            System.out.println(startChar + ":" + endChar);
            if(startChar != endChar){
                return false;
            }
            i += 1;
            j -= 1;
        }
        return true;
        
    }
}
