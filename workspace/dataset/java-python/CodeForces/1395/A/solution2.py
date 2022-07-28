def numOfOdd(*args):
    num = 0
    for col in args:
        if col % 2 != 0:
            num += 1
    return num


for _ in range(int(input())):
    r, g, b, w = map(int, input().split())

    nOdd = numOfOdd(r, g, b, w)
    if r == 0 or g == 0 or b == 0:
        if numOfOdd(r, g, b, w) == 1 or numOfOdd(r, g, b, w) == 0:
            print("Yes")
        else:
            print("No")
    else:
        if nOdd == 2:
            print("No")
        else:
            print("Yes")
