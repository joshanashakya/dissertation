n=int(input())strings=[]all=[]alps=[]for i in range(26):    alps.append(chr(ord('a')+i))    all.append(alps[i])for i in range(26):    for j in range(i,26):        all.append(alps[i]+alps[j])for i in range(n):    s=input()    for j in range(len(s)):        for k in range(j,len(s)):            strings.append(s[j:k+1])ans=''#print(strings)for i in all:    f=1    for j in strings:        if i==j:            f=0            break    if f==1:        print(i)        break  