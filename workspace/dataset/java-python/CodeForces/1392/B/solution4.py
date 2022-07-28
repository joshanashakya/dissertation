t = int(input())
for _ in range(t):
    n, k = map(int, input().split())
    l = list(map(int, input().split()))
    a = max(l)
    l1 = []
    for i in l:
        l1.append(a - i)
    b = max(l1)
    l2 = []
    for j in l1:
        l2.append(b - j)
    # print(l2)
    if k % 2 == 1:
        print(*l1)
    else:
        print(*l2)
