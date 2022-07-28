from math import ceil ai, ar = map(int, input().split())
bi, br = map(int, input().split()) if (ceil(bi / 2) - 1 <= ar and not bi + 1 < ar) or (
        ceil(br / 2) - 1 <= ai and not br + 1 < ai):
    print('YES')else:
    print('NO')
