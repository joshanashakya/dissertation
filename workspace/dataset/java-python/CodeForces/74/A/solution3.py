a = [input().split() for i in range(int(input()))]
print(sorted([[100 * int(a[i][1]) - 50 * int(a[i][2]) + int(a[i][3]) + int(a[i][4]) + int(a[i][5]) + int(a[i][6]) + int(
    a[i][7]), a[i][0]] for i in range(len(a))])[-1][1])
