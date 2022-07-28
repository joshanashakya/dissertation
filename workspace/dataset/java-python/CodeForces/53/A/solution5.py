s = input()
res = "z" * 1000
n = int(input())
for i in range(n):    t = input()
if (t[:len(s)] == s):        res = min(res, t)
print(s if res == "z" * 1000 else res)
