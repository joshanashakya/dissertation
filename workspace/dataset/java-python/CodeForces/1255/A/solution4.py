n = int(input())for i in range(n):  a,b = map(int,input().split())  c = abs(a-b)  print(c//5+(c%5)//2+(c%5)%2)
