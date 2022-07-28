from sys import stdininput = stdin.readline n = int(input())a = [int(x) for x in input().split()]x = min(a)for i in a:    if i % x > 0:        print(-1)        breakelse:    print(x)
