m=input()a=list(map(int,input().split()))a.reverse()dic={};i=0for m in a:    if m not in dic:        dic[m]=i        i+=1print(max(dic, key=dic.get))
