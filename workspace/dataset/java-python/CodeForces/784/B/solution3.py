n = int(input())a = hex(n)b = (a[2::]).upper()count = 0for i in b:    if i == '4' or i=='6' or i=='9' or i=='0' or i=='A' or i=='D':        count +=1    elif i == '8' or i=='B':        count+=2print(count)