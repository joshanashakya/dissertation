n = int(input())
k = [0] + list(map(int, input().split()))
for i in range(1, n + 1):    if
i != k[i]: t = k[i]
k[i:t + 1] = k[i:t + 1][::-1]
if k == [*range(n + 1)]:
    print(i, t)        else:
    print(0, 0)
exit()
print(0, 0)
