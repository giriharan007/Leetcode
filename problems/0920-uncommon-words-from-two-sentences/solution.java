class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> count1 = new HashMap<>();
        Map<String, Integer> count2 = new HashMap<>();
        for (String word : s1.split(" ")) {
            count1.put(word, count1.getOrDefault(word, 0) + 1);
        }
        for (String word : s2.split(" ")) {
            count2.put(word, count2.getOrDefault(word, 0) + 1);
        }
        List<String> result = new ArrayList<>();
        for (String word : count1.keySet()) {
            if (count1.get(word) == 1 && !count2.containsKey(word)) {
                result.add(word);
            }
        }
        for (String word : count2.keySet()) {
            if (count2.get(word) == 1 && !count1.containsKey(word)) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }
}
