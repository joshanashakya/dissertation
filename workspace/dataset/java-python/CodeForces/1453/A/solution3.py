for _ in range(int(input())):    n, m = map(int, input().split())
l = list(map(int, input().split()))
x = list(map(int, input().split()))
l = set(l)
x = set(x)
z = l | x
print(abs(len(z) - (n + m)))
