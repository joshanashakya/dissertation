t=str(input())s=str(input())z=0if len(t) == len(s):    for i in range(0,len(t)):        if t[i] == s[len(t)-1-i]:            z+=1if z == len(t):    print("YES")else:    print("NO")
