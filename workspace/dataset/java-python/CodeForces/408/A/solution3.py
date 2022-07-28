n = int(input())r = lambda : list(map(int, input().split()))arr = r()ans = float('inf')for i in range(n):    x = r()    c = sum(x) * 5 + 15*len(x)    ans = min(ans , c)  print(ans) 
