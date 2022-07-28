a,b=input().split('|')c=input()for i in range(len(c)):    if len(a)<=len(b):        a+=c[i]    elif len(a)>len(b):        b+=c[i]if len(a)==len(b):     print(a+'|'+b)else:    print('Impossible') 
