num = input() arr = input().split() mx = 0ct = 0for word in arr:    for char in word:        if char.isupper():            ct += 1    mx = max(mx, ct)    ct = 0 print(mx) 
