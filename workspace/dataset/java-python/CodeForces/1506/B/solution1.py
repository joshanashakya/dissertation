# CodeForces
# Jason Zhong
import math

cases = int(input())
for c in range(cases):
    length, k = map(int, input().split())
    string = input()
    start = string.index('*')
    end = length - 1 - string[::-1].index('*')
    count = 1
    while start < end:
        ind = start + k
        if ind >= end:
            count += 1
            break
        else:
            while ind > start:
                if string[ind] == '*':
                    count += 1
                    break
                ind -= 1
        start = ind
    print(count)
