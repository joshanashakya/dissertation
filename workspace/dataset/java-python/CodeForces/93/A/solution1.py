n, m, a, b = map(int, input().split())
ans = 0
a -= 1;
b -= 1  # 去掉一位方便计算
if a // m - b // m == 0:
    ans = 1  # 在同一行时
elif a % m == 0:  # 起点在每一行的首位
    if (b + 1) % m == 0 or b + 1 == n:
        ans = 1  # 终点在末尾，或者剩下的都选择
    else:
        ans = 2
else:  # 起点都不在首位
    if a % m - b % m == 1:
        ans = 2  # 关键点：余数相差为1时
    elif (b + 1) % m == 0 or b < (a // m + 2) * m or b + 1 == n or b // m - a // m == 1:
        ans = 2
    # 终点在末尾，终点只到下一行，终点到末尾
    else:
        ans = 3
print(ans)
