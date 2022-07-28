import io, osinput=io.BytesIO(os.read(0, os.fstat(0).st_size)).readlineimport
matht = int(input())
for _ in range(t):    n, k = list(map(int, input().split()))
arr = list(map(int, input().split()))
arr.sort()
x = arr[1] - arr[0]
for i in range(2, n):        x = math.gcd(x, arr[i] - arr[0])
if (k - arr[0]) % x == 0:
    print("YES")    else:
    print("NO")
