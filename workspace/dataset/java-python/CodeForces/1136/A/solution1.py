n = int(input())check = [0] * 10005for i in range(n):    a, b = map(int, input().split())    for j in range(a, b + 1):        check[j] = ic = int(input())print(n - check[c])
