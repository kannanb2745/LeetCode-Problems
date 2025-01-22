a = dict.fromkeys([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], 1)

# Increment the values of keys 1, 2, and 3
for key in [1, 2, 3]:
    if key in a:
        a[key] += 1

print(a)
