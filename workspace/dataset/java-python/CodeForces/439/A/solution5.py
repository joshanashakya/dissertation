n, d = map(int, input().split())arr = list(map(int, input().split())) if (sum(arr) + (n-1)*10) > d:    print(-1)else:    ans = (d - sum(arr))//5    print(ans)
