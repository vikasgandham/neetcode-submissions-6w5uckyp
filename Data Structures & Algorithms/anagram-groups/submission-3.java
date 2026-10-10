class Solution {
    /*

     act -> [0,0,0,0,0,0,]
    */
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> result= new HashMap<String, List<String>>();
        for (String s: strs){
            String hashedString = getHashedString(s);
            result.computeIfAbsent(hashedString, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(result.values());

        
    }

    private String getHashedString(String input){
        StringBuilder sb = new StringBuilder();
        int hash[] = new int[26];
        for(int i=0; i< input.length(); i++){
            int c = input.charAt(i)-'a';
            hash[c]++;
        }
        for (int v: hash){
            sb.append(v);
            sb.append("#");
        }
        return sb.toString();

    }
}
