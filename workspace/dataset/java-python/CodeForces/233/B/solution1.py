from math import sqrtn=int(input())ans=1000000000000000000an=ansfor i in range(90):    d=i**2+4*n    rd=int(sqrt(d))    if(rd**2==d):                x=-i+rd        if(x%2==0):            x=x//2            su=0            xx=x            while xx>0:                su+=xx%10                xx=xx//10            if(su==i):                ans=min(ans,x)    if(an==ans):    print(-1)else:    print(ans)
