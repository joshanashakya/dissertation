cases = int(input())for i in range(cases):    a,b,c = map(int,input().split())    print( max(a-b,a-c) + 1)
