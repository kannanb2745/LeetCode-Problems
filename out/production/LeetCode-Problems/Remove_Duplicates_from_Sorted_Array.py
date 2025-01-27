class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0

        k = 1  # Pointer for the position of unique elements

        # Iterate through the list starting from the second element
        for i in range(1, len(nums)):
            if nums[i] != nums[i - 1]:
                nums[k] = nums[i]  # Update the value at the k-th position
                k += 1  # Increment the count of unique elements

        return k
