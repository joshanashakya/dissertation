x,y=map(int,input().split())num=int(input())num%=6num=num if num != 0 else num+6t,l=x,yfor _ in range(num-2):    x,y=y,y-x    x%=10**9+7    y%=10**9+7if num == 1:    print(t%(10**9+7))elif num == 2:    print(l%(10**9+7))else:      print(y)