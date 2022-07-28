import mathn=int(input())a=list(map(int,input().split()))k=[]mn=10000000000for i in range(n):    sm=math.ceil((a[i]-i)/n)    if sm<mn:        mn=sm        ind=iprint(ind+1)        
