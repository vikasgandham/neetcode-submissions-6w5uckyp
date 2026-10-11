class Solution {
    public boolean isValid(String s) {

        HashMap<Character, Character> parMap = new HashMap(
            Map.of(
                '{', '}', 
                '(', ')',
                '[', ']'        
           )
        );

        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(char c: s.toCharArray()){
           System.out.println(c);
            if(parMap.keySet().contains(c)){
                System.out.println("pushing");
                 System.out.println(c);
                stack.push(c);
            }else{
                System.out.println("popped");
                if (stack.isEmpty()){
                    return false;
                }
                char popped = stack.pop();
                System.out.println(c);
                System.out.println(popped);
                if(parMap.get(popped) != c){
                    return false;
                }
            }
        }
        return stack.isEmpty();
        
    }
}
