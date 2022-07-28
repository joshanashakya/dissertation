n = input()n = int(n) if n >= 0:    print(n)else:    n = str(n)    print(max(int(n[0:-2] + n[-1:]), int(n[0:-1])))
