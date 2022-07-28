num = int(input())arr = list(map(int, input().split()))mn = min(arr)if arr.count(mn) > 1:    print("Still Rozdil")else:    print(arr.index(mn)+1)  
