class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        s = s.rstrip()
        return len(list(map(str, s.split(' ')))[-1])
