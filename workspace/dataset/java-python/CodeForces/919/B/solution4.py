def find(num):    s=0    while num>0:        s=s+num%10        num=num//10    return sn=int(input())c=1num=19while c<n:    num=num+9    if find(num)==10:        c=c+1print(num)     
