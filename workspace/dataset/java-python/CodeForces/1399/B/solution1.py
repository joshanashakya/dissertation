for i in range(int(input())):
    sum1 = 0
    n = int(input())
    x = list(map(int, input().split()))
    y = list(map(int, input().split()))
    x1, y1 = min(x), min(y)
    for j in range(n):
        sum1 = sum1 + max(x[j] - x1, y[j] - y1)
    print(sum1)
