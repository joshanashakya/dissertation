t=int(input()) for i in range(t):    n=int(input())    a=list(map(int,input().split()))    k=sum(a)    m=[]    if(max(a)<0):        print("NO")    else:        maa=-100000000        s=0        size=len(a)        c=0        cc=0        for i in range(0,size):            if(a[i]>=0):                s+=a[i]                c+=1             else:                if(maa<s):                    maa=s                     cc=c                if(s+a[i]<=0):                    s=0                     c=0                else:                    s=s+a[i]                    c+=1        if(maa<s):            maa=s;            cc=c                     if(a[0]==0 and len(set(a))==1):            print("NO")        elif(maa==k):            if(cc==len(a)):                print("YES")            else:                print("NO")         elif(maa<k):            print("YES")        else:            print("NO")            