for i in range(int(input())):    a, b = map(int, input().split())    print(0.5 + a / (b << 4) if 4 * b > a else 1 - b / a if a else 1)
