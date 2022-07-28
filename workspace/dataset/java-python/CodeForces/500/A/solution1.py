n,t=list(map(int,input().split()))a=list(map(int,input().split()))i=1while i<t:    i+=a[i-1]print('YES' if i==t else 'NO')
