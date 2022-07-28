import mathfor

_ in range(int(input())): n, k = map(int, input().split())
a = [*map(int, input().split())]
x = a[1] - a[0]
for i in range(1, n):        x = math.gcd(a[i] - a[0], x)
k -= a[0]
if k % x == 0:
    print("YES")    else:
    print("NO")
