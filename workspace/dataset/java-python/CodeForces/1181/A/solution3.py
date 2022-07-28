x,y,z = map(int,input().split())n = (x+y)//zans = 0if x//z+y//z<n:    print(n,min(z-x%z,z-y%z))else:    print(n,0)
