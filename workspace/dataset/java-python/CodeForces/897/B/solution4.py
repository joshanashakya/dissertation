k, p = map(int, input().split())res = 0for i in range(1, k+1):    res += int(str(i)+(str(i)[::-1]))    res %= pprint(res)
