n = int(input())s = list(str(input()))r = [""]*nif n % 2 != 0:    j = n // 2    for i in range(n):        if i % 2 == 0:            r[j+i] = s[i]            j += i        else:            r[j-i] = s[i]            j -= ielse:    j = (n // 2) - 1    for i in range(n):        if i % 2 != 0:            r[j+i] = s[i]            j += i        else:            r[j-i] = s[i]            j -= i print("".join(r))