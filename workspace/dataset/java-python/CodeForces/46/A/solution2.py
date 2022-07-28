n=int(input())a=0b=[]for i in range(1,n):    a=(a+i)%n    b.append(a+1)print(*b)
