import sysfrom os import pathif(path.exists('input.txt')):    sys.stdin = open("input.txt", "r")    sys.stdout = open("output.txt", "w")N = 10**5 + 5n, l, r, q1, q2 = map(int, input().split())w = [int(x) for x in input().split()]pre = [0] * Nfor i in range(n):    pre[i + 1] = pre[i] + w[i] ans = 10**18 for i in range(n + 1):    curr = pre[i] * l + (pre[n] - pre[i]) * r    x, y = i, n - i    if(x < y):        curr += q2 * (y - x - 1)    elif(x > y):        curr += q1 * (x - y - 1)    ans = min(ans, curr)print(ans)