a  , b = map(int , input().split())r = lambda : list(map(int, input().split()))arr = [r() for _ in range(a)] f = Falsefor i in range(a):    for j in range(b):        if arr[i][j] == 1  and (i==0 or i==a-1 or j==0 or j==b-1):            f = True            break  print(2 if f else 4)
