t = int(input())for u in range(t):    n, m = map(int, input().split())    a = [int(i) for i in input().split()]    add = 0    for i in range(1, n):        add += a[i]    print(min(m, a[0] + add))
