n,a,b = list(map(int, input().split()))days = list(map(int, input().split())) for i in range(n):    start = max(0, i-a)    end = min(i+b+1, n)    if days[i] == min(days[start:end]):        print(i+1)        break
