n = int(input())d = int(input())e = int(input())i = 0ans = nwhile(i*e*5<=n):    ans = min(ans,(n-i*e*5)%d)    i+=1print(ans) 
