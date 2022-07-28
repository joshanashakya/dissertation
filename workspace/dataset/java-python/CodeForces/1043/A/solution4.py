n= int(input())arr = list(map(int, input().split())) given = sum(arr)needed = given*2+1 for_each = (needed+n-1)//n print(max(for_each, max(arr))) 
