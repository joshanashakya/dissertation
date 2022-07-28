I=lambda:[*map(int,input().split())]z,u,v=I(),I(),I()r=0for x,y in (z,z[::-1]):  for a,b in (u,u[::-1]):    for c,d in (v,v[::-1]):      r|=a+c<=x and max(b,d)<=yprint('YNEOS'[1-r::2])
