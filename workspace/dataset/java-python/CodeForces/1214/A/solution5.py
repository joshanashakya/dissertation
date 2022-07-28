n = int(input())d = int(input())e = int(input())ans = n%dwhile n>=5*e:    n-= (5*e)    ans = min(ans,n%d)print(ans)     
