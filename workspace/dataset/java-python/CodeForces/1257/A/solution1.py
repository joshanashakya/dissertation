a=int(input())for i in range(a):    b,c,d,e=map(int,input().split())    f=min(b-1,abs(e-d)+c)    print(f)
