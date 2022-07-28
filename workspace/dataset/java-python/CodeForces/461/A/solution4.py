n = int(input())a = sorted(map(int,input().split()))s =0for i in range(n-1):	s+=a[i]*(i+2)print(s+a[-1]*n)
