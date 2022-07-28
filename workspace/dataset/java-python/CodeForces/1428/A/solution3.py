for t in range(int(input())):    p, q, r, k = map(int, input().split())
if p == r:
    print(abs(q - k))    elif q == k:
    print(abs(p - r))    else:
    print(abs(p - r) + abs(q - k) + 2)
