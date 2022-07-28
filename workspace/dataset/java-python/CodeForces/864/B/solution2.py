n = int(input())s = input() + 'Z' arr = set()m = 0for i in s:    if i.isupper(): arr.clear()    else:        arr.add(i)        m = max( m , len(arr)) print(m)
