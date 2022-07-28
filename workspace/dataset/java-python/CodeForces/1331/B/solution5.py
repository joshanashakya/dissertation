n=int(input()) f=[]for i in range(2,n):    if n%i==0:        while n%i==0:            n//=i            f.append(i) print(''.join(str(c) for c in f))
