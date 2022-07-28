num = int(input())arr = list(map(int, input().split()))arr.sort()lst = []for i in range(num-1):    lst.append(abs(arr[i+1] - arr[i])) print(min(lst),lst.count(min(lst)))  
