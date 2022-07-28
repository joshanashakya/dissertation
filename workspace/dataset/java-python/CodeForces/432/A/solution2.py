a = list(map(int, input().split()))b = list(map(int, input().split())) k = []for i in range(len(b)):    if 5 - b[i] >= a[1]:        k.append(b[i]) print(len(k)//3)
