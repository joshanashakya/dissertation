def main():    m, n = map(int, input().split())    a = list(map(int, input().split()))    p = list(map(int, input().split()))    for i in range(m - 1):        for j in range(m - i - 1):            if a[j] > a[j + 1]:                if j + 1 in p:                    a[j], a[j + 1] = a[j + 1], a[j]                else:                    print('NO')                    return 0    print("YES")    return 0  for _ in range(int(input())):    main()
