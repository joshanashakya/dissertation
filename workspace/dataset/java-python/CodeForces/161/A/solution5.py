n, m, x, y = map(int,input().split())A = list(map(int,input().split()))B = list(map(int,input().split()))i = 0j = 0count = 0Ac = []Bc = []while i<n and j<m:    if A[i] - x <= B[j] <= A[i]+y:        count += 1        Ac.append(i+1)        Bc.append(j+1)        i += 1        j += 1    elif A[i] - x > B[j]:        j += 1    elif A[i] + y < B [j]:        i += 1print (count)for x in range (count):    print (Ac[x],Bc[x])
