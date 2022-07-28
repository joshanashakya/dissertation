n,s = map(int,input().split())A = list(map(int, input().split()))A.sort()if sum(A[:n-1])<=s:    print("YES")else:    print("NO") 
