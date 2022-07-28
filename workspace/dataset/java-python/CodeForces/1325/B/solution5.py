from sys import stdininput = stdin.readline t = int(input())for _ in range(t):    n = int(input())    a = [int(x) for x in input().split()]    ans = len(set(a))    print(ans)
