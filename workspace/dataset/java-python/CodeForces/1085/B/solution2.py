li = list(map(int,input().split())) n = li[0]k = li[1]  ans = [] for r in range(1,k):    m = n*k/r + r        if str(m)[len(str(m))-1]=="0":        p = int(m-r)/k        #print(p)        if str(p)[len(str(p))-1]=="0":            ans.append(m)  print(int(min(ans)))#print(ans)         
