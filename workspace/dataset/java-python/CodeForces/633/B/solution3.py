def findTrailingZeros(t):           count = 0      i=5    while (t/i>=1):         count += int(t/i)         i *= 5      return int(count)  m = int(input())k = 0N_list = list() for i in range(0, 500000):    t = findTrailingZeros(i)    if(t == m):        k = k+1        N_list.append(i)    print(k)for i in N_list:    print(i, end = " ")