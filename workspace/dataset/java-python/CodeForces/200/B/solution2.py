n = int(input())arr = list(map(int, input().split())) total = norange_content = 0for i in range(n):    orange_content += arr[i]/100    print(float(orange_content/total) * 100)
