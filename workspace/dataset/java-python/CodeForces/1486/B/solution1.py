I = input
exec(int(
    I()) * 'n=int(I());k,m=(1+x[n>>1]-x[n-1>>1]for x in map(sorted,zip(*(map(int,I().split())for _ in[0]*n))));print(k*m);')
