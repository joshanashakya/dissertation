n, k = map(int, input().split())a = list(map(int, input().split()))lead = 0lst = []for i in range(1, n + 1):    lst.append(i)for i in range(k):    ind = (lead + a[i])%len(lst)    print(lst[ind], end=" ")    lead = ind    lst[ind] = -1    llst = []    for j in range(len(lst)):        if lst[j] != -1:llst.append(lst[j])    lst = list(llst)
