for _ in range(int(input())): n, k = map(int, input().split());s = input();l = [0] * k;f = k
for i in range(k):  v = [];c = 0
for j in s[i::k]:   if
j != '?':
if j not in v: v += [j];c += 1
if c > 1:
    break  else:
    if
v: l[i] = (-1) ** int(v[0]);
f -= 1
continue
break else:print(["NO", "YES"][abs(sum(l)) <= f]);
continue
print("NO")
