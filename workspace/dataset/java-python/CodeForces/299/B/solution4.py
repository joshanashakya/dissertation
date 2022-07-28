k = int(input().split(' ')[1])s = input().split('.')flag = Truefor i in s:    if len(i) >= k:        flag = False        breakprint('YES' if flag else 'NO')
