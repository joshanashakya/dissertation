s = input()count = 0for i in range(len(s)):    if s[i] == "H" or s[i] == "Q" or s[i] == "9":        count = count + 1 if count >= 1:    print("YES")else:    print("NO")
