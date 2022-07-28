n=int(input())l=list(map(int,input().split()))m=abs(l[0]-l[-1])a,b=1,nfor i in range(n-1):    if m>abs(l[i]-l[i+1]):        m=abs(l[i]-l[i+1])        a,b=i+1,i+2print(a,b)
