n = int(input())b = list(map(int, input().split()))m = int(input())g = list(map(int, input().split()))b.sort()g.sort()i, j = 0, 0ans = 0while i<n and j<m:    if abs(b[i]-g[j])<=1:        ans+=1        i+=1        j+=1    else:        if b[i]<g[j]:            i+=1        else:            j+=1print(ans)    
