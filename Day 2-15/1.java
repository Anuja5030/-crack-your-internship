class Solution {
    public static int findDuplicate(int[] nums) {
    int len = nums.length;
    int[] cnt = new int[len + 1];
    for (int i = 0; i < len; i++) {
        cnt[nums[i]]++;
        if (cnt[nums[i]] > 1) {
            return nums[i];
        }
    }

    return len;
}

    // Main method to sort the colors
    public void sortColors(int[] nums) {
      int l = 0;              // Pointer for the next position of 0
      int r = nums.length - 1; // Pointer for the next position of 2
  
      // Loop through the array
      for (int i = 0; i <= r;)
        if (nums[i] == 0)          // If the current element is 0
          swap(nums, i++, l++);   // Swap it with the element at l, then increment both i and l
        else if (nums[i] == 1)      // If the current element is 1
          ++i;                    // Just move to the next element
        else                       // If the current element is 2
          swap(nums, i, r--);     // Swap it with the element at r, then decrement r
    }
  
    // Helper method to swap two elements in the array
    private void swap(int[] nums, int i, int j) {
      final int temp = nums[i]; // Store the value at index i in temp
      nums[i] = nums[j];        // Assign the value at index j to index i
      nums[j] = temp;           // Assign the value in temp to index j
    }
  }
  