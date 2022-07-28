n = int(input())li = list(map(int, input().split()))st =Falseres = 0for i in range(n-1):    if i==0:        res += abs(li[i])    res += abs(li[i]-li[i+1])print(res)
