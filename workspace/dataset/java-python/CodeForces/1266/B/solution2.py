n = int(input())li = list(map(int, input().split()))for i in li:    tmp = i % 14    dc = i // 14    if 6 >= tmp >=1 and dc >= 1:        print("YES")    else:        print("NO")
