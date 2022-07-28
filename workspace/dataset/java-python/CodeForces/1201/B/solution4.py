n = int(input())a = list(map(int,input().split()))maxi = max(a)s = sum(a)if maxi*2>s or s%2==1:	print("NO")else:	print("YES")
