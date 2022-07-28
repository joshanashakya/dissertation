from collections import Counter


def func():
    x, y = map(int, input().split())
    s = int(x * (x + 1) / 2)
    # print(s)
    if y % s == 0:
        print("0")
        return
    y = y % s
    # print(y)
    for i in range(1, x + 1):
        if y >= i:
            y -= i
        else:
            print(y)
            return


t = 1
# t=int(input())
for i in range(t):
    func()
