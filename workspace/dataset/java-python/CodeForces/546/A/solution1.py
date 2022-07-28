z=0x=list(map(int,input().rstrip().split()))for i in range(1,x[2]+1):    z=z+(i*x[0])if x[1]-z < 0:    print(abs(z-x[1]))else:    print(0)
