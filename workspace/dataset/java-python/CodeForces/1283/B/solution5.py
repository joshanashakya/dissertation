import sysinput = sys.stdin.readline t = int(input())for _ in range(t):    n, k = map(int, input().split())    a = n // k    ans = min(n, a * k + k // 2)    print(ans)
