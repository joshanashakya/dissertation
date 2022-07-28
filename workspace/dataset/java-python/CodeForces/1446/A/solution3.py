import sys, mathfrom

collections
import defaultdict, dequeinput=sys.stdin.readline  t = int(input())
while (t > 0):    n, w = map(int, input().split())
l = list(map(int,
             input().split()))  # l.sort(reverse=True)    ll=[]    for i in range(n):        ll.append([l[i],i+1])    ll.sort(reverse=True)    cur=0    ans=[]    mini=math.ceil(w/2)    for i in range(n):        if(cur+ll[i][0]<=w):            cur+=ll[i][0]            ans.append(ll[i][1])        if(cur>=mini):            break    if(cur>=mini and cur<=w):        print(len(ans))        print(*ans)    else:        print(-1)    t-=1
