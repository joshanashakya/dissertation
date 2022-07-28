for _ in range(int(input())):    n = int(input())
i = [int(a) for a in input().split()]
t, o = i.count(1), i.count(2)
if t % 2 == 0 and (o % 2 == 0 or t >= 2):
    print('YES')    else:
    print('NO')
