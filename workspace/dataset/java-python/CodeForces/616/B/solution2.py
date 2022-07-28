a , b = map(int , input().split())r = lambda : list(map(int, input().split()))arr = [r() for _ in range(a)] ans = 0for i in arr:    ans = max(ans , min(i)) print(ans)
