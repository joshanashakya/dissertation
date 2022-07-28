for _ in range(int(input())):
    n = int(input())
    l = sorted([int(x) for x in input().split()])
    res = 'YES'
    for i in range(len(l) - 1):
        if l[i + 1] - l[i] > 1:
            res = 'NO'
            break
    print(res)
