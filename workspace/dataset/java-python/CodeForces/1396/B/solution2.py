import random
import datetime
import itertools

TC = int(input())
for tc in range(TC):
    p = int(input())
    piles = list(map(int, input().split()))

    mx = max(piles)
    s = sum(piles)

    if (mx > s - mx or (s % 2 == 1)):
        print("T")
    else:
        print("HL")
