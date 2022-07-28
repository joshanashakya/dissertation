t = int(input())
for i in range(t):    n, c0, c1, h = map(int, input().split())
s = [int(x) for x in str(input()[:n])]
ori = c0 * s.count(0) + c1 * s.count(1)
x = (h * (s.count(0))) + (n * c1)
y = (h * (s.count(1))) + (n * c0)
print(min(ori, x, y))
