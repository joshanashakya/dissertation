def check_permutations(p1, p2, p3, p4, x):    total = 0


s1 = {p1, p2, p3, p4}
for i in s1:        a = i
s2 = {a}
s2 = s1 - s2
for j in s2:            b = j
s3 = {j}
s3 = s2 - s3
for k in s3:                c = k
s4 = {k}
s4 = s3 - s4
for z in (s4):                    d = z
if ((((x % a) % b)) % c) % d == x:                        total += 1
return total
p1, p2, p3, p4, a, b = map(int, input().split())
ans = 0
for i in range(a, b + 1):    if
check_permutations(p1, p2, p3, p4, i) >= 7: ans += 1
print(ans)
