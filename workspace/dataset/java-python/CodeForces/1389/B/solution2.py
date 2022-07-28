for _ in range(int(input())):
    n, k, z = map(int, input().split())
    arr = list(map(int, input().split()))

    pairSum = [[i, i + 1] for i in range(n - 1)]
    pairSum.sort(key=lambda x: arr[x[0]] + arr[x[1]])
    sumUptoK = sum(arr[:k + 1])
    ans = sumUptoK

    for leftMoves in range(1, z + 1):
        if k < 2:
            break

        sumUptoK -= arr[k] + arr[k - 1]
        k -= 2
        temp = sumUptoK

        while True:
            if not pairSum:
                break

            if pairSum[-1][1] <= k + 1:
                ans = max(ans, sumUptoK + (arr[pairSum[-1][0]] + arr[pairSum[-1][1]]) * leftMoves)
                break
            else:
                pairSum.pop()

    print(ans)
