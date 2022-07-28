I = input
exec(int(I()) * "x,y=map(int,I().split());u,d,r,l=map(I().count,'UDRL');print('NYOE S'[-d<=y<=u and-l<=x<=r::2]);")
