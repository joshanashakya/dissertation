for i in range(int(input())):
    n = int(input())
    a = [int(i) for i in input().split()]
    b = [int(i) for i in input().split()]
    ma = min(a)
    mb = min(b)
    moves = 0
    for i in range(len(a)):
        moves += max(a[i] - ma, b[i] - mb)
    print(moves)
