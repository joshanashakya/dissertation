for i in range(int(input())):  n, k = map(int, input().split())
lis = list(map(int, input().split()))
temp = 0
rr = sorted(lis, reverse=True)
for i in range(k + 1):    temp += rr[i]
print(temp)
