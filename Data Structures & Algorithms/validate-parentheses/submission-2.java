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
           
            if(parMap.keySet().contains(c)){
                stack.push(c);
            }else{
                if (stack.isEmpty()){
                    return false;
                }
                char popped = stack.pop();
                if(parMap.get(popped) != c){
                    return false;
                }
            }
        }
        return stack.isEmpty();
        
    }
}
