def check(a1, a2):    m1 = 0


c1 = 0
for i in range(0, len(a1)):        c1 = c1 + a1[i]
m1 = max(m1, c1)
sum = m1
m1 = 0
c1 = 0
for i in range(0, len(a2)):        c1 = c1 + a2[i]
m1 = max(m1, c1)
sum += m1
return sum  for _ in range(int(input())):    x = int(input())
a1 = list(map(int, input().split()))
y = int(input())
a2 = list(map(int, input().split()))
k = (check(a1, a2))
print(k)
