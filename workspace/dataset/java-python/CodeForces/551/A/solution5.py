num = int(input())arr = list(map(int, input().split()))ct = 1ln = len(set(arr))arr = [i*3000 for i in arr]while ln > 0:    mx = max(arr)    add = arr.count(mx)    arr = [ct if i == mx else i for i in arr]    ct += add    ln -= 1 print(*arr)          
