n,k,m = map(int, input().split())S = list(map(str, input().split()))toid = {}for i, s in enumerate(S):    toid[s] = iA  = list(map(int, input().split()))dmin = {}INF = 10**18for i in range(k):    temp = list(map(int, input().split()))    res = INF    for j in temp[1:]:        res = min(res, A[j-1])    for j in temp[1:]:        dmin[j-1] = resT = list(map(str, input().split()))ans = 0for t in T:    ans += dmin[toid[t]]print(ans)
