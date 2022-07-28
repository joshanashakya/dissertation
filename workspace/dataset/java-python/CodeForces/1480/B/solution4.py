import mathfrom

sys
import stdininput = stdin.readlinefor
_ in range(int(input())): A, B, n = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
for i in range(n):        fights = math.ceil(b[i] / A)
B -= a[i] * fights     B += max(a)
if B > 0:
    print("YES")    else:
    print("NO")
