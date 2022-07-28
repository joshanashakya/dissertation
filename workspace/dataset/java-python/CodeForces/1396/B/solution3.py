for _ in range(int(input())):
    n = int(input())
    a = [*map(int, input().split())]
    s, mx = sum(a), max(a)
    print("T" if s % 2 == 1 or mx > s - mx else "HL")
