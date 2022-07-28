import math 

def solve():    n, k = map(int, input().split())


ps = list(map(int, input().split()))
sum1 = ps[0]
maximum = 0
for i in range(1, len(ps)):        temp = math.ceil((100 * ps[i] - k * sum1) / k)
if temp > maximum:            maximum = temp
sum1 += ps[i]
print(maximum)    t = int(input())
while t > 0:    solve()
t = t - 1
