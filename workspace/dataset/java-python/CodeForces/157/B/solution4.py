import mathI=lambda:list(map(int,input().split()))n = int(input())a = sorted(I(), reverse = True)area = 0for i in range(len(a)):    if i%2 == 0:        area+=a[i]**2*math.pi    else:        area-=a[i]**2*math.piprint(area)
