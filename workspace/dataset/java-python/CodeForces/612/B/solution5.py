n = int(input())f = [int(x) for x in input().split()] main = []for i in range(n):    main.append((f[i],i))main.sort() ans = 0for i in range(n-1):    ans+=abs(main[i][1]-main[i+1][1]) print(ans)
