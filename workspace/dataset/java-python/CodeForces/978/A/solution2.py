T= int(input())arr = list(map(int,input().split()[:T]))no_dupe = []for i in range(len(arr)):    if arr[i] in no_dupe:        no_dupe.remove(arr[i])    no_dupe.append(arr[i])print(len(no_dupe))print(" ".join(map(str,no_dupe)))