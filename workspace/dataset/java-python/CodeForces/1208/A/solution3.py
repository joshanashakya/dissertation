for _ in range(int(input())):    a, b, c = map(int, input().split())    c %= 3    print([a, b, a ^ b][c])
