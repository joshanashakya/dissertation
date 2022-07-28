s = input()  f = Falsefor i in range(len(s) - 2):    x = s[i:i+3]     if 'A' in x and 'B' in x and 'C' in x:        f= True        break # print(s)print("Yes" if f else "No")
