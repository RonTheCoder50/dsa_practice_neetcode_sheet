class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Optimal solution avoid sorting & array (char) for each string.
        // TC will be from O(n * (n*m)) -> O(n * m) by reducing sorting.

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            //everytime count frequency
            int freq[] = new int[26];
            for(char ch: str.toCharArray()) {
                freq[ch - 'a']++;
            }

            //build unique key via stringbuilder
            StringBuilder sb = new StringBuilder();
            for(int count : freq) {
                sb.append("#").append(count);
            }

            String key = sb.toString(); //it will generate unique key.
            
            //put if key is newer/unique & map those corrosponding strings with it.
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
