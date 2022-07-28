m, n = map(int,input().split())res = 0for i in range(m):    res += float((i+1) * (pow(float(i+1)/float(m), n) - pow(float(i)/float(m), n)))print(res)
