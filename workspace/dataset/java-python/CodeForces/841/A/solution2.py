import string a , b = map(int , input().split())s = input() f = Truefor i in string.ascii_lowercase:    if s.count(i) > b:        f = False        break  if f: print("YES")else: print("NO")
