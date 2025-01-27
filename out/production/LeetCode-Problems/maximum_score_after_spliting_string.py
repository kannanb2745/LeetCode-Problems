class Solution:
    def maxScore(self, s: str) -> int:
       
        total_ones = s.count('1')
        zeros_count = 0  
        ones_count = 0   
        max_score = float('-inf') # setting to infinity, you can assign zero also 

       
        for i in range(len(s) - 1):
            if s[i] == '0':
                zeros_count += 1
            else:
                ones_count += 1
            
        
            current_score = zeros_count + (total_ones - ones_count)
    
            max_score = max(max_score, current_score)
        
        return max_score
