from sys import stdininput = stdin.readline t = int(input())for _ in range(t):    n = int(input())    a = [int(x) for x in input().split()]    if n == 1 and a[0] % 2 > 0:        print(-1)        continue    odd = []    for i in range(n):        if a[i] % 2 == 0:            print(1)            print(i+1)            break        else:            odd.append(i+1)            if len(odd) == 2:                print(2)                print(*odd)                break