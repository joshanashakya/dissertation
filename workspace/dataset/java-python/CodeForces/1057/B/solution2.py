import sysinput = sys.stdin.buffer.readline n = int(input())a = list(map(int, input().split()))lst = [a[0]]for i in range(1, n):    lst.append(lst[-1] + a[i]) mx = 0for i in range(n):    for j in range(i, n):        if lst[j] - lst[i] + a[i] > 100*(j-i+1) and j-i+1 > mx:            mx = j - i + 1print(mx)
