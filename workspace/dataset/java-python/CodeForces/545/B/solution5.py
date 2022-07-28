a = input()b = input()l =[]for i in range(len(a)):    if (a[i] != b[i]):       l.append(i) if len(l)%2:    print("impossible")elif l:  i = l[len(l)//2]  print(a[:i]+b[i:]) else:  print(a)
