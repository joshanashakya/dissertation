n = int(input())a = list(map(int,input().split()))l = [0]*nm =a[n-1]for i in range(n-2,-1,-1) :    l[i] = max(0,m-a[i]+1)    m = max(m,a[i])print(*l)
