s = input()n = len(s)t = ''k = (n-1)//2for c in zip(s[k::-1],s[k+1:]):    t+=c[0]+c[1]if n%2 == 1:    t+=s[0]print(t)
