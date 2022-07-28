t = int(input())for _ in range(t):    x,y = tuple(map(int,input().split(' ')))    print(0 if x % y == 0 else y - x%y)
