n,k=map(int,input().strip().split())a=list(map(int,input().strip().split()))b=list(map(int,input().strip().split()))ups = [[i+1 for i in range(n)]]downs = [[i+1 for i in range(n)]] def apply(arr):    out = [0]*n    for i in range(n):        out[i] = arr[a[i]-1]    return out def unapply(arr):    out = [0]*n    for i in range(n):        out[a[i]-1] = arr[i]    return out for i in range(k):    ups.append(apply(ups[i]))for i in range(k):    downs.append(unapply(downs[i])) earliest = [None, None]earliestPossible = [None, None]for i in range(k,-1,-1):    if ups[i] == b:        earliest[0] = i    if downs[i] == b:        earliest[1] = i        # print("YES")        # exit(0)for i in range(k,-1,-2):    if ups[i] == b:        earliestPossible[0] = i    if downs[i] == b:        earliestPossible[1] = iif (not earliestPossible[0]) and (not earliestPossible[1]):    print("NO")    exit(0)if ((not earliestPossible[0]) or earliest[0] < earliestPossible[0]) and ((not earliestPossible[1]) or earliest[1] < earliestPossible[1]):    print("NO")    exit(0)if ups[0] == b or (ups[1] == b and downs[1] == b and k > 1):    print("NO")    exit(0)print("YES")   # tem = [i+1 for i in range(n)]# for i in range(k):#     tem = apply(tem)# for i in range(k):#     tem = unapply(tem)# print(tem)
