n=int(input())A=list(map(int,input().split()))t=A[0]i=0while t<n:    i+=1    i%=7    t+=A[i]print(i+1)
