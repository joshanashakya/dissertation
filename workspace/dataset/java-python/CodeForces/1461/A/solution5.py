for _ in range(int(input())):    n, k = map(int, input().split())
p = n
t = "a" * k
n -= k
while n > 0:        t += "bca"
n -= 3
print(t[:p])
