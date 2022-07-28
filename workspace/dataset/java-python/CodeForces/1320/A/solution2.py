import sysinput = sys.stdin.readline n = int(input())b = [int(x) for x in input().split()]c = [0] * (10 ** 6)for i in range(n):    c[b[i] - i] += b[i] print(max(c))
