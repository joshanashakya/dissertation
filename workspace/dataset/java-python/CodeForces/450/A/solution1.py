import mathn,m=map(int,input().split())A=list(map(int,input().split()))B=[]max=0last=0for i in range(n):    if math.ceil(A[i]/m)>=max:        last=i        max=math.ceil(A[i]/m)print(last+1)
