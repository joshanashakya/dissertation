n = input()s = str(input())a = set()res = 0for i in s:    if i.islower():        a.add(i)        res = max(res,len(a))    else:        a.clear()print(res)
