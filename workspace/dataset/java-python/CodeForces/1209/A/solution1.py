n = int(input())num2=[]num = list(map(int, input().split()))num.sort()count = 0 while len(num)!=0:    minno = min(num)    count+=1    num2 =  [num[i] for i in range(len(num)) if num[i]%minno!=0]    num.clear()    num.extend(num2)    num2.clear()print(count)
