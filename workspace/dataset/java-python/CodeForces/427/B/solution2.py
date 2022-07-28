n, t, c = map(int, input().split())k = 0s = 0for i in list(map(int, input().split())):    if i<=t:        k+=1        if k>=c:            s+=1    else:        k=0print(s)
