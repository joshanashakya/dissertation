s = input()l = list(map(str,input().split()))k = ''.join(map(str,l))c = 0if s[0] in k or s[1] in k:    c = c + 1 if c >= 1:    print("YES")else:    print("NO")    
