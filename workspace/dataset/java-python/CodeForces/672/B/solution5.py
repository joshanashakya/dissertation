n=int(input())s=input()if n>26:    print(-1)    exit()m=[]for i in s:    if i not in m:        m.append(i)print(n-len(m))
