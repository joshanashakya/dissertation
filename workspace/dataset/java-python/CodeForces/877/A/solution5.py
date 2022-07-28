import re str = 'Danil|Olya|Slava|Ann|Nikita'if (len(re.findall(str, input())) == 1): print('YES')else: print('NO')
