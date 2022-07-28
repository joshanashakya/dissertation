import mathinp = input()n,k = inp.split()n = int(n)k = int(k)minn = 1if (n-k==0) or (k==0):    minn = 0    maxx = 0 maxx = k*2if (n-maxx-k<0):    maxx = n-k  print(minn,end=" ")print(maxx)
