n = int(input())found=Falsebus=[]for i in range(n):    row = list(input())    for seat in range(len(row)-1):        if(row[seat]==row[seat+1] and row[seat]=='O' and not found):            found = True            row[seat] = '+'            row[seat+1] = '+'    bus.append(row) if found:    print("YES")    for i in range(n):        print("".join(map(str,bus[i])))else:    print("NO")
