from sys import stdinn = int(stdin.readline())a = list(map(int, stdin.readline().split()))b = list(map(int, stdin.readline().split()))v = [0] * (6)for i in a:    v[i] += 1for i in b:    v[i] -= 1 for i in v:    if i % 2:        print(-1)        breakelse:    print(sum([abs(i) for i in v])//4)