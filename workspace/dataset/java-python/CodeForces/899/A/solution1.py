a=int(input())b=input()c2=b.count('2')c1=b.count('1')sum=0sum+=min(c2,c1)c1-=c2if c1>0:    sum+=c1//3print(sum)
