a , b = input().split() ans = "z" *  101  f = ""l = "" for i in a:    f += i    l = ""    for j in b:        l+=j        ans = min(ans , f+l) print(ans) 
