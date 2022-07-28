t1=t2=0.0A=[0.0]*100005n=int(input())A=list(map(float,input().split()))for i in range(n):	t2+=(t1*2+1)*A[i]	t1=(t1+1)*A[i]print("{:.15f}".format(t2))
