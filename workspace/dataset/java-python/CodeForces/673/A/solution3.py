N=int(input())A=list(map(int,input().split()))A.insert(0,0)T=0F=Truefor i in range(N):    if A[i+1]-A[i]<=15:        T=A[i+1]    else:        T+=15        F=False        breakif F:    if T>=75:        print(90)    else:        print(T+15)else:    print(T)