def findPairs(arr, size):
    Map = {}

    # consider every pair (arr[i], arr[j])
    # and where (j > i)
    for i in range(0, size - 1):
        for j in range(i + 1, size):

            # calculate Sum of current pair
            Sum = arr[i] + arr[j]
            # print(Map)

            # if Sum is already present in the Map
            if Sum in Map:

                if ((Map[Sum][0] != i and Map[Sum][0] != j) and (Map[Sum][1] != i and Map[Sum][1] != j)):
                    t = (Map[Sum][0] + 1, Map[Sum][1] + 1, i + 1, j + 1)
                    return t

            if Sum not in Map:
                Map[Sum] = [i, j]
            # print(Map[Sum][0])

    return (-1, -1, -1, -1)


def solve1():
    n = int(input())
    arr = list(map(int, input().split()))
    a, b, c, d = findPairs(arr, n)
    if a == -1:
        print("NO")
    else:
        print("YES")
        print(a, b, c, d)


for testis in range(1):
    solve1()
