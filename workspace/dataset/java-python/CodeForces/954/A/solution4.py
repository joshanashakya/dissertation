n = int(input())s = list(input())c = 0 for i in range(n-1):    if s[i]+s[i+1] == 'RU' or s[i]+s[i+1] == 'UR':        s[i], s[i+1] = 'D', 'D'        c += 1 print(len(s)-c)
