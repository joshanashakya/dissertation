n = int(input())l = [int(i) for i in input().split()][:n]                           #n space seprated integers inputcount = 0for i in l:    s=sum(l)-i    if(s%2==0):        count+=1 print(count) 
