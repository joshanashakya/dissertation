n = int(input())
r = [1] * ns = input()
y = 1
while y:    y = 0
for i in range(n - 1):        if
s[i] == '=' and r[i] != r[i + 1]: r[i] = r[i + 1] = max(r[i:i + 2]);
y = 1
if s[i] == 'L' and r[i] <= r[i + 1]: r[i] = r[i + 1] + 1;y = 1
if s[i] == 'R' and r[i] >= r[i + 1]: r[i + 1] = r[i] + 1;y = 1
print(*r)
