n=int(input())t=int(input())a=tb=abs(7-t)ans='YES'for i in range(0,n):    x,y=map(int,input().split(" "))    fl=0    if x==a or x==b:        fl=1    if y==a or y==b:        fl=1    if fl==1:        ans='NO' print(ans)