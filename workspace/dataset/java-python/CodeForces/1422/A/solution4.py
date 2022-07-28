t = int(input())
for i in range(t):    a, b, c = map(int, input().split())
d = a + b + c - 1
if a < b + c + d and b < a + c + d and c < a + b + d and d < a + b + c:        print(d)
