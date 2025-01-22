class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
            # Start from the last digit and work backwards
        for i in range(len(digits) - 1, -1, -1):
            if digits[i] != 9:
                digits[i] += 1 # for constant input if it doesn't contain 9 on last index  
                return digits
            digits[i] = 0  
        return [1] + [0] * len(digits)  # Example: [9, 9, 9] -> [1, 0, 0, 0]
