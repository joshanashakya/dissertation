n = int (input())l = int(input())ll = 7-lk =[]m =[]mm="YES"h=-1for i in range(n):    x, y = map(int, input().split())    k.append(x)    m.append(y)if l in k or l in m or ll in k or ll in m:    mm="NO"print(mm)   