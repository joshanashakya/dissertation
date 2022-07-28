import mathfor _ in " " * int(input()):    n, x = map(int, input().split())    a = list(map(int, input().split()))    mx = max(a)    print(1 if x in a else 2 if mx > x else math.ceil(x/mx))
