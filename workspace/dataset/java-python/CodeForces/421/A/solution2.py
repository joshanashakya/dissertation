a, b, c = map(int, input().split())arr1 = sorted(map(int, input().split()))arr2 = sorted(map(int, input().split())) ans = []for i in range(1, a+1):    if i in arr1:        ans.append(1)    else:        ans.append(2) print(*ans)