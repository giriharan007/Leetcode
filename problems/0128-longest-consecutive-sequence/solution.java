 class Solution {
     public int longestConsecutive(int[] nums) {
//         Set<Integer> set = new HashSet<>();

//         for (int num : nums) {
//             set.add(num);
//         }

//         int maxStreak = 0;


//         for (int num : nums) {
         
//             if (!set.contains(num - 1)) {
//                 int currentNum = num;
//                 int currentStreak = 1;

//                 while (set.contains(currentNum + 1)) {
//                     currentNum++;
//                     currentStreak++;
//                 }

//                 maxStreak = Math.max(maxStreak, currentStreak);
//             }
//         }

//         return maxStreak;
//     }
// }

        if (nums.length == 0) return 0;

        Arrays.sort(nums); 
        int maxStreak = 1, currentStreak = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) continue; 
            if (nums[i] == nums[i - 1] + 1) {
                currentStreak++;
            } else {
                maxStreak = Math.max(maxStreak, currentStreak);
                currentStreak = 1;
            }
        }

        return Math.max(maxStreak, currentStreak);
    }
}
