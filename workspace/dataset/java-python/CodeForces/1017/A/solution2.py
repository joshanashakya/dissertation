l=[]for i in range(int(input())): l.append(sum(list(map(int,input().split()))))print(sum(1 for i in l if i>l[0])+1)
