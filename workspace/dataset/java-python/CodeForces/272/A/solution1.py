n=int(input())A=list(map(int,input().split()))f=n+1cnt=0for i in range(sum(A)+1,sum(A)+6):    if i%f==1:        cnt+=1print(5-cnt)
