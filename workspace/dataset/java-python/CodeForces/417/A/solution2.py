from math import ceil,floorc,d = map(int,input().split())n,m = map(int,input().split())k = int(input())Needed = n*mif(Needed<=k):    print(0)    exit()Needed -= kx = ceil(Needed/n) * cy = ceil(Needed) * dz = floor(Needed/n)*c + (Needed%n)*dprint(min(x,y,z))