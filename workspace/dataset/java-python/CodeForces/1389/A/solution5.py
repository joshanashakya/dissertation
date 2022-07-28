a = int(input())
for i in range(a):
    l, r = (map(int, input().split()))
    if 2 * l > r:
        print("-1 -1")
    else:
        print(str(l) + " " + str(2 * (l)))
