s = input()n = len(s)f = Falsefor i in range(len(s)//2):    if s[i] != s[n-1-i]:        o = s[:n-i] + s[i] + s[n-i:]        p = s[:i] + s[n-i-1] + s[i:]        f = True         if o==o[::-1]:            print(o)        elif p==p[::-1]:            print(p)        else:            print("NA")        break  if not f:    if n%2==0:        print(s[:n//2] + 'y' + s[n//2:])    else:        x = s[n//2]        print(s[:n//2] + x + s[n//2:])
