t = int(input())


def mex1(arr):    i = 0


while (1):        if
i not in arr:
return i else:i += 1


def mex2(arr):    i = 0


while (1):        if
arr.count(i) < 2:
return i else:i += 1 for _ in range(t):    n = int(input())
arr = list(map(int, input().split()))
if 0 not in arr:
    print(0)    elif arr.count(0) == 1:
    print(mex1(arr))    else:
    print(mex1(arr) + mex2(arr))
