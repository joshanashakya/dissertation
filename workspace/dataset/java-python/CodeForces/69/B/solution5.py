import sysfrom

array
import \
    array  # noqa: F401  def input():    return sys.stdin.buffer.readline().decode('utf-8')  n, m = map(int, input().split())a = [tuple(map(int, input().split())) for _ in range(m)]ans = 0 for i in range(1, n + 1):    time, profit = 10**9, 0    for j in range(m):        if a[j][0] <= i <= a[j][1] and time > a[j][2]:            time = a[j][2]            profit = a[j][3]    ans += profit print(ans)
