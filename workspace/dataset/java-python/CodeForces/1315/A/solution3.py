for t in range(int(input())):    a, b, x, y = map(int, input().split())     area = max(b*x, (a-x-1)*b, a*y, (b-y-1)*a)    print(area)
