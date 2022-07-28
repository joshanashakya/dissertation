num = int(input())arr = sorted(map(int, input().split())) x = sum(arr[:num//2])y = sum(arr[num//2:]) ans = x**2 + y**2 print(ans)  
