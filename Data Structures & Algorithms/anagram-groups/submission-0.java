class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            String hashedString = getHashedString(str);
            map.computeIfAbsent(hashedString, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
        
    }

    public String getHashedString(String input){
        int a[] = new int[26];
        for(char i: input.toCharArray()){
            a[i-'a'] += 1;
        }
        StringBuilder finalString = new StringBuilder();
        for(int i : a){
            finalString.append(i).append("#");
        }
        return finalString.toString();
    }
}