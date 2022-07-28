val = [1, 0, 0, 0, 1, 0, 1, 0, 2, 1, 1, 2, 0, 1, 0, 0]n = int(input())x = hex(n)x = x[2:]ans = 0for i in x:    i = int(i, 16)    ans = ans + val[i]print(ans)
