n = int(input()) for i in range(1, n + 1):    j, k = map(int, input().split())
if 2 * j >= k + 1:
    print("YES")    else:
    print("NO")
