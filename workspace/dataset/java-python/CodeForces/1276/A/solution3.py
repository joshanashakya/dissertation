# import sys# sys.stdin = open('input.txt', 'r')  # sys.stdout = open('output.txt', 'w')  t=int(input())for _ in range(t):    s=input()    i=0    l=[]    n=len(s)    le=0    while(i<n):        if s[i:i+5] == "twone":            l.append(i+3)            i+=4        if s[i:i+3] in ('one','two'):            l.append            l.append(i+2)            i+=2        i+=1    print(len(l))    print(*l)
