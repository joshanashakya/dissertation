arr = [6 , 2 , 5 , 5 , 4 , 5 , 6 , 3 , 7 , 6]ans = 0a , b = map(int , input().split())for i in range(a , b+1):    x = list(str(i))    for j in x:        ans += arr[int(j)] print(ans)
