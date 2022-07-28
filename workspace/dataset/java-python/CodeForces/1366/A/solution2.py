for _ in range(int(input())):    l, r = map(int, input().split())    print(min(l, r, (l + r) // 3))
