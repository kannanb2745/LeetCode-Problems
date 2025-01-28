class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        hashset = []
        for i in nums:
            if i not in hashset:
                hashset.append(i)
            else:
                return True
        return False
