class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
              Set<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word.toLowerCase());
        }

        // Step 2: Clean the paragraph: remove punctuation and convert to lowercase
        paragraph = paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase();

        // Step 3: Split the paragraph into words
        String[] words = paragraph.split("\\s+");

        // Step 4: Use a HashMap to count word frequencies
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (!bannedSet.contains(word) && word.length() > 0) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // Step 5: Find the most frequent word
        String mostCommon = "";
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostCommon = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        return mostCommon;  
    }
}
