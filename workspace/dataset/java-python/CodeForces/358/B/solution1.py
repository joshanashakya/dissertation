n = int(input())ts = [input() for i in range(n)]t = '<3' + '<3'.join(ts) + '<3's = input()i = 0j = 0while i < len(t) and j < len(s):    if t[i] == s[j]:        i += 1    j += 1print(i == len(t) and 'yes' or 'no')
