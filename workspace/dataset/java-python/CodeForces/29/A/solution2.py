n=int(input())arr=[]for i in range(n):    arr.append([])    arr[i]=[int(z) for z in input().split()]for i in range(n):    for j in range(i+1,n):            if arr[i][0]+arr[i][1]==arr[j][0] and  arr[j][0]+arr[j][1]==arr[i][0]:                print("YES")                exit()print("NO")    
