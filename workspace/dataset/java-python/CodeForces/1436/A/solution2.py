t = int(input())
while t:    t -= 1
n, m = map(int, input().split())
l = list(map(int, input().split()))
sum = 0
for x in l: sum += x
if sum == m:
    print("YES")    else:
    print("NO")
