from math import logfrom math import ceila, b = map(int, input().split())chislo = 1mno = 1ans = 0flag = 1while flag:    flag = 0    chi = 1    m = 1    if chislo <= b:        flag = 1    for _ in range(1, ceil(log(chislo, 2))):        m *= 2        if chislo - chi <= b or chislo - chi <= a:            flag = 1        if chislo - chi >= a and chislo - chi <= b:            ans += 1        chi += m - m // 2    mno *= 2    chislo += mnoprint(ans)
