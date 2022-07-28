import sysinput = sys.stdin.readlinefor
_ in range(int(input())): n = int(input())
res = []
for i in range(min(n, 2)): res.append(str(9 - (i % 10)))
for i in range(2, n): res.append(str((9 + i - 2) % 10))   print("".join(res))
