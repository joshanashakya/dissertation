t=int(input())for a in range(t):    n=int(input())    bt=list(map(int,input().split()))    bt.sort()    #print(bt)    if bt[0]>=1:        ans=1        temp=1        for a in bt:            temp+=1            if temp>a:                ans=temp        print(ans)    else:        print(1)
