n,s = map(int,input().split())arr = list(map(int,input().split()))mn= min(arr)sm = sum(arr)if sm < s:    print(-1)elif(sm == s):    print(0)else:    avg = (sm - s)//n    print(min(mn,avg))
