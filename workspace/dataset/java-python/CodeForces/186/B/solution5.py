n, t1, t2, k = [int(y) for y in input().split()]res=[]for i in range(n):    a, b = [int(y) for y in input().split()]    temp = max((a*t1*(100-k))/100 + b*t2, (b*t1*(100-k))/100 + a*t2)    res.append([i+1, round(temp, 2)])res = sorted(res, key = lambda item: item[1], reverse=True)for i in res:    if str(i[1])[-3]!='.':i[1]=str(i[1])+'0'    print(i[0], i[1])