A = [1,3,2,4]
B = [3,1,2,4]


a , b = sorted(A), sorted(B)
result = []
for i in range(max(len(A), len(B))):
    if a[i] in b and b[i] in a:
        result.append(i)
        
lst = [1]
print(*lst in [1, 2, 3, 4])