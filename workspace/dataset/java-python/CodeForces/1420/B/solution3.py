import matht=int(input())
for z in range(t):    n = int(input())
arr = list(map(int, input().split()))
counter = [0] * 30
for i in range(n):        counter[int(math.log(arr[i], 2))] += 1
ans = 0
for num in counter:        if
num >= 2: ans = ans + (num * (num - 1)) // 2
print(ans)                   
