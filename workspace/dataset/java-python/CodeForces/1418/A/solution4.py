import sysinput = sys.stdin.readline for test in range(int(input())):    x, y, k = [int(i) for i in input().split()]
need = y * k + k - 1  # k * (y + 1) - 1    print((need + (x - 2)) // (x - 1) + k)
