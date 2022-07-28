s = list(input())  if s == s[::-1]:    if len(set(s)) == 1:        print(0)    else:        print(len(s)-1) else:    print(len(s))  
