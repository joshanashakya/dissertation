#wtf loldef unmerge(arr):    cnt=1    mx=arr[0]    ls=[]    for i in range(1,len(arr)):        if arr[i]>mx:            ls.append(cnt)            mx=arr[i]            cnt=1        else:            cnt+=1    if cnt:        ls.append(cnt)    dp=1    for i in ls:        dp|=dp<<i #10100101    if dp&1<<len(arr)//2: #check the halfway bit        return "YES"    return "NO" for i in range(int(input())):    a=input()    lst=list(map(int,input().strip().split()))    print(unmerge(lst))
