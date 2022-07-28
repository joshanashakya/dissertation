t = int(input())
for _ in range(t):    n = int(input())
a = [int(s) for s in input().split(" ")]
a.reverse()
print(" ".join(map(str, a)))
