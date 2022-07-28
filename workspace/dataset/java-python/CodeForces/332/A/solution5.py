n = int(input())s = input()i = ncount = 0while i<len(s):    if s[i-1]==s[i-2]==s[i-3]:        count+=1    i+=nprint(count)
