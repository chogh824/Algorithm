k = []

for i in range(9):
    k.append(int(input()))

print(max(k))
print(k.index(max(k)) + 1)