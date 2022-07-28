n = int(input()) arr = [i for i in range(1, n + 1)] * 100 ans = []i = 1j = 1while n > 1:    ans.append(arr[i])    i += j + 1    j += 1    n -= 1 print(*ans)
