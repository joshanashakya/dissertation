import sysinput = sys.stdin.readline n = int(input())a = list(map(int,input().split()))d = [0]*(n+1)MOD = int(1e9+7) for i in range(0,n):    d[i+1] = ( d[i] + (d[i] - d[a[i]-1]) + 2 + MOD)%MOD    print(d[n]);
