import sys  # sys.stdin = open('input.txt', 'r')# sys.stdout = open('output.txt', 'w') input = sys.stdin.readline t = 1 while t:    t -= 1     n = int(input())    a = sorted(list(set(map(int, input().split()))))    m = 2*a[-1]    prev = [0]*(m+1)    ans = 0    j = 0    for el in a:        prev[el+1] = el    for i in range(1, len(prev)):        if not prev[i]:            prev[i] = prev[i-1]                  for el in a:        k = 2        while k*el <= m:            ans = max(ans, prev[k*el]%el)            k += 1    print(ans)       
