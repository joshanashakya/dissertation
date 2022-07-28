for _ in range(1):    # n = int(input())    n = list(map(int, input().split()))    q = set(n)    print(len(n)-len(q))
