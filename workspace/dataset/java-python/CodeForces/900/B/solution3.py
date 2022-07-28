a,b,c=map(int, input().split())for i in range(2*b):  a *= 10  if (a//b==c):    print(i+1)    break  a %= belse:     print(-1)
