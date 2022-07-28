import matht = int(input())
for _ in range(t):    x, y, k = map(int, input().split())
coal = ((k * y + k - 1) + x - 2)
totalstcks = k + coal - 1
trade = coal // (x - 1)
ans = trade + k
print(ans)
