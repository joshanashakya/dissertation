a,b=map(int,input().split())x,y,z=map(int,input().split())if a < x*2+y:    ry=x*2+y-aelse:    ry=0if b < y+z*3:    rb=y+z*3-belse:    rb=0print(ry+rb)
