n,x=map(int,input().split());s=0for _ in ' '*n:    d=int(input().replace(' ', ''))    if x+d<0:s+=1    else:x+=dprint(x,s)
