dic = {}for i in range(-10,11):    dic[i] = 0n = int(input())arr = list(map(int,input().split()))for i in arr:    dic[i] += 1summ = 0for i in range(1,11):    summ += dic[i]*dic[-i]summ += dic[0]*(dic[0]-1)//2print(summ)