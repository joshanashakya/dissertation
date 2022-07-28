t = int(input())for i in range(t):    a, b = list(map(int, input().split()))    d = abs(a-b)    print(int(d/5) + int(d%5/2) + d%5%2)
