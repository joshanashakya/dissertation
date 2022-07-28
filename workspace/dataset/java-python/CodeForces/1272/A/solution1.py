n = int(input())for i in range(n):    a, b, c = [int(x) for x in input().split()]    l, r = min(a, b, c), max(a, b, c)    if l < r:        l += 1    if l < r:        r -= 1    print(2 * (r - l))
