import sys


def answer(n, m, Sx, Sy):
    print(Sx, Sy)
    rptr = 0

    cols = [int(i) for i in range(1, m + 1, 1)]

    rows = [int(i) for i in range(Sx, 0, -1)]
    rows.extend([int(i) for i in range(Sx + 1, n + 1, 1)])
    # print('rows=', rows, 'cols=', cols)
    for r in rows:
        for c in cols:
            if r == Sx and c == Sy:
                pass
            else:
                print(r, c)
        cols.reverse()

    return  # null


def main():
    n, m, Sx, Sy = [int(i) for i in sys.stdin.readline().split()]
    answer(n, m, Sx, Sy)

    return


main()
