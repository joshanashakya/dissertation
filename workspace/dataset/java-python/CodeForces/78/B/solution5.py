n = int(input())
s = 'VIBGYOR'
times = n // 7
remains = n % 7
if remains > 4:
    print(f'{s * times}{s[0:remains]}')else:
    print(f'{s * times}{s[3:3 + remains]}')
