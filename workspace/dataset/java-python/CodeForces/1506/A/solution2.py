for _ in range(int(input())):
    n, m, x = map(int, input().split())
    # by rows:
    # cells are numbered starting from one;
    # cells are numbered from top to bottom by rows, and inside each row from left to right;
    # number of each cell is an integer one greater than the number of the previous cell.
    if (x % n == 0):
        column_x = x // n
    else:
        column_x = x // n + 1
    row_x = x - abs(((column_x - 1) * n))
    if (row_x == 1):
        v = column_x
    else:
        v = (row_x - 1) * m + column_x
    print(v)
