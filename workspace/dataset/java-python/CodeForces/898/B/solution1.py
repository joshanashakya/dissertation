n = int(input())a = int(input())b = int(input()) for x in range(n+1):    if (n - (x*a))%b == 0 and (n - (x*a))//b >= 0:        print("YES")        print(x, (n - (x*a))//b)        exit()print("NO") 
