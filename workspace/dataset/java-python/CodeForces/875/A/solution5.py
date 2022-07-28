n,a,y=int(input()),[1,2,3,4,5,6,7,8,9],[]x=n-99 if n>99 else 1for i in range(x,n):    sum=0    for j in str(i):        sum+=int(j)    if sum+i==n: y.append(i)print(len(y))print(*y)
