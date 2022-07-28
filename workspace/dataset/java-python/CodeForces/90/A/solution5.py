rgb = list(map(int, input().split()))
ans = 0
for i in range(3):    temp = (rgb[i] - 1) // 2 * 3 + 30 + i
ans = max(temp, ans)
print(ans)
