n=int(input())p=input()list=p.split(" ")for i in range(0, n):    list[i] = int(list[i])l=0h=0max=list[0]min=list[0]for i in range(1,n):    if list[i]>max:        max=list[i]        h=h+1    if list[i]<min:        min=list[i]        l=l+1print(l+h)
