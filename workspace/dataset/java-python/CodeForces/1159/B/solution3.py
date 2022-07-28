n = int(input())l = [int(x) for x in input().split()]ans = 1e10for i in range(n):    ans = min(ans, l[i]//max(n-i-1, i))print(ans) 
