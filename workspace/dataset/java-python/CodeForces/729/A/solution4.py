n = int(input())s = input()for i in range(n // 2, -1, -1):    s = s.replace('ogo' + i * 'go', '***')print(s)
