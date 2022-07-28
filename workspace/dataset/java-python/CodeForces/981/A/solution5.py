pal=lambda s: s!=s[::-1]s=input()a=[]for i in range(len(s)):    for j in range(i+1):        if pal(s[j:i+1]):            a.append(len(s[j:i+1]))if len(a)>0:print(max(a))else:print(0)
