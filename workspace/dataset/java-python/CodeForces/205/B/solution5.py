m=int(input())l=list(map(int,input().split()))t=0print(sum(l[i]-l[i+1] for i in range(m-1) if l[i]>l[i+1]))
