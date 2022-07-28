num = int(input())li  = list(map(int,input().split()))li2=[]for i in range(num):    a  = li.count(li[i])    li2.append(a)print(max(li2))
