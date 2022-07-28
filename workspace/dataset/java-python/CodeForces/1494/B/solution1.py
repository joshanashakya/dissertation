for _ in range(int(input())):    flag = 0
n, u, r, d, l = map(int, input().split())
for i in range(0, 2):        for
j in range(0, 2):
for k in range(0, 2):                for
m in range(0, 2):
if 0 <= u - i - j <= n - 2 and 0 <= r - j - k <= n - 2 and 0 <= d - k - m <= n - 2 and 0 <= l - i - m <= n - 2:                        flag = 1
if flag == 0:
    print("NO")      else:
    print("YES")
