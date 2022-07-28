n, t, k, d = map(int,input().split())ar = (n//k + int(n%k>0)) * tdd = d//tn -= dd*kki = (n//(k*2) + int(n%(2*k)>0)) * t + dd * tif ki < ar:    print('YES')else:    print('NO')
