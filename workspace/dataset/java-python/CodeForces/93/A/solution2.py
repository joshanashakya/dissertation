n, m, a, b = map(int, input().split())
ans = 0
a -= 1;
b -= 1
if a // m - b // m == 0:
    ans = 1
elif a % m == 0:
    if (b + 1) % m == 0 or b + 1 == n:
        ans = 1
    else:
        ans = 2
else:
    if a % m - b % m == 1:
        ans = 2
    elif (b + 1) % m == 0 or b < (a // m + 2) * m or b + 1 == n or b // m - a // m == 1:
        ans = 2
    else:
        ans = 3
print(ans)
