a = input()b = input() i = -1  while a[i] == b[i]:    i-=1    if(abs(i) > len(a) or abs(i) > len(b)): break print(len(a)+len(b) - 2*(abs(i)-1))
