#!/usr/bin/env python3.9

for _ in range(int(input())):
    n, k = list(map(int, input().split(' ')))
    s = input()
    i = s.find('*')
    end = s.rfind('*')

    stars = 2 if i != end else 1
    while i + k < end:
        # print(i+k+1)
        if s[i + k] == '*':
            i += k
            stars += 1
        else:
            i -= 1

    print(stars)
    # if l == 0:
    #     print(1)
    # else:
    #     print(l // (k+1) + 2)
