a,b,c,d=map(int,input().split())a=sorted([a,b,c])print(max(0,d-(a[1]-a[0]))+max(0,d-(a[2]-a[1])))
