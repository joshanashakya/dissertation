# https://codeforces.com/contest/1251/problem/A from collections import Counter t = int(input())while t > 0:    strr = input()    func = {}    i = 0    while i < len(strr):        j = i + 1        counter = 1        while j < len(strr) and strr[i] == strr[j]:            j += 1            counter += 1        if counter % 2 != 0:            func[strr[i]] = True        elif strr[i] not in func.keys():            func[strr[i]] = False        i = j        corr = ''    for key in func.keys():        if func[key] == True:            corr += key    print(''.join(sorted(corr)))    t -= 1