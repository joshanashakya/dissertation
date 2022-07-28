num = int(input())li = list(map(int,input().split()))li.sort()a  = 0for i in range(0,num,2):    a += abs(li[i]-li[i+1])print(a)
