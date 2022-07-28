num = int(input())arr = sorted(map(int, input().split()))  for n in arr:    if n < 0:        ans = n    else:        x = int(n**0.5)        if n != x*x:            ans = n print(ans)  
