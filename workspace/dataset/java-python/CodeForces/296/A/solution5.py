from collections import Countern = int(input())#n,m = map(int,input().split())l = list(map(int,input().split()))  d = Counter(l)h = list(d.values())h.sort(reverse = True)if (n % 2 == 0 and h[0] <= n //2) or (n%2 != 0 and h[0] <= (n//2)+1 ):    print("YES")else:    print("NO") 
