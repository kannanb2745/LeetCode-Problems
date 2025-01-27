"""
num1, num2 =64, 40
hashmap = {}
for i in range(num1+num2+1):
    if bin(i)[2::].count('1') == bin(num2)[2::].count('1'):
        temp = i ^ num1
        if temp not in hashmap:
            hashmap[temp] = i
        else:
            hashmap[temp] = min(hashmap[temp], i)
        
print(hashmap)
print(hashmap[min(hashmap)])

This code works but its time complexity is  which is not optimal."""

class Solution(object):
    def minimizeXor(self, num1, num2):
        a, b = bin(num1).count('1'), bin(num2).count('1')
        res = num1
        for i in range(32):
            if a > b and (1 << i) & num1 > 0:
                res ^= 1 << i
                a -= 1
            if a < b and (1 << i) & num1 == 0:
                res ^= 1 << i
                a += 1
        return res