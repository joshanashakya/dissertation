li = list(map(int, input()))n = len(li)st = Falseif 0 in li:    li.remove(0)    print(*li,sep = '')else:    li.pop()    print(*li,sep='')
