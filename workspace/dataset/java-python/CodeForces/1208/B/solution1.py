import ioimport osimport mathinput = io.BytesIO(os.read(0, os.fstat(0).st_size)).readline# python3 15.py<in>op# a, b = map(float, i/nput().split()) n = int(input())l = [int(x) for x in input().split()]d = set()ans = 1e9for i in range(n+1):    d = set(l[:i])    if len(d) < i:        break    r = n-1    while (r >= i and l[r] not in d):        d.add(l[r])        r -= 1    ans = min(ans, r-i+1)print(ans)
