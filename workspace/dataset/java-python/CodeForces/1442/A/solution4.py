from sys import stdin t = int(stdin.readline()) for case in range(t):    n = int(stdin.readline())
a = [int(x) for x in stdin.readline().split()]     left = [a[0]]
right = [a[-1]]     for x in range(1, n):        left.append(min(left[-1], a[x]))
right.append(min(right[-1], a[-x - 1]))     right = right[
                                                    ::-1]   # print(left)    #print(right)    #print([left[x]+right[-x-1] for x in range(n)])     good = "YES"     cLeft = a[0]     rightVein = 0     for x in range(n):        if cLeft + rightVein >= a[x]:            cLeft = min(cLeft, a[x]-rightVein)        else:            if right[x] + cLeft >= a[x]:                rightVein = max(rightVein, a[x]-cLeft)                cLeft = min(cLeft, a[x]-rightVein)            else:                good = "NO"                break     print(good)
