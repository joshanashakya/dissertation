i=lambda:map(int,input().split())n,k=i()a=*i(),s=sum(a)print(max(abs(s-sum(a[j::k]))for j in range(k)))
