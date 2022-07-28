# cook your dish here

def removeSmallest():
    s = arr[0] + arr[1]
    k = 0
    if len(arr) < 3:
        k = -1

    for i in range(2, n):
        if s <= arr[i]:
            k = 0
            x = i + 1
            break

        else:
            k = -1

    if k == 0:
        return ("" + str(1) + " " + str(2) + " " + str(i + 1))
    else:
        return -1


t = int(input())
for _ in range(t):
    n = int(input())
    arr = list(map(int, input().split()))

    print(removeSmallest())
