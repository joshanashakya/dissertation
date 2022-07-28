n, m = map(int, input().split())
athletes = {}
for i in range(m):    l, r, t, c = map(int, input().split())
athletes[i + 1] = [l, r, t, c]
ans = 0
for i in range(1, n + 1):    lowTime = 10 ** 5
money = 0
for athlete in athletes:        if
athletes[athlete][0] <= i <= athletes[athlete][1] and athletes[athlete][2] < lowTime: lowTime = athletes[athlete][2]
money = athletes[athlete][3]
ans += money
print(ans)
