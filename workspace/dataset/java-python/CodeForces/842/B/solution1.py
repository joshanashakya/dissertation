R,D=map(int,input().split())cnt=0for _ in range(int(input())):    x,y,r=map(int,input().split())    d=(x*x+y*y)**(0.5)    if(r+d<=R and d-r>=R-D):        cnt+=1print(cnt)
