s=input()sum=0for i in range(len(s)):    a=s.find('bear',i)    if a==-1:        break    sum+=len(s)-(a+4)+1print(sum)
