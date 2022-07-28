f=lambda:map(int,input().split())s,n=f()for a, b in sorted(list(f()) for i in ' '*n):	s=(s+b)*(s>a)print('YNEOS'[s<1::2])
