n = input()r = lambda : list(map(int, input().split()))arr = r()mi = min(arr)ma = max(arr)c = 0 for i in arr:    if i!=mi and i!=ma: c+=1 print(c)  
