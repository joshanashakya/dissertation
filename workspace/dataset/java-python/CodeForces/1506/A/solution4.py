# https://codeforces.com/problemset/problem/1506/A

import math


def main():
    t = int(input())
    cases = []

    for i in range(t):
        cases.append(list(map(int, input().split())))

    for case in cases:

        if case[2] % case[0] == 0:
            row = case[0]
        else:
            row = case[2] % case[0]

        col = math.ceil(case[2] / case[0])

        x = row * case[1] - (case[1] - col)

        print(x)


if __name__ == '__main__':
    main()
