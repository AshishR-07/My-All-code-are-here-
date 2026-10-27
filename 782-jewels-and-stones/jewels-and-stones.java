class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashMap<Character, Integer> hash = new HashMap<>(); 
        
        for (char ch : stones.toCharArray())
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);
            
        for (char cha : jewels.toCharArray()) 
            count += hash.getOrDefault(cha, 0);
            
        return count;
    }
}