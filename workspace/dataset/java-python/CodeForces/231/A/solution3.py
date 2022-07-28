n = int(input())a = 0for i in range (n):    x, y, z = map(int, input().split())    if (x+y+z)>1:        a+=1print(a)
