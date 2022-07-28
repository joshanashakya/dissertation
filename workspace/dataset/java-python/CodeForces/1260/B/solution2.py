for _ in range(int(input())):    a, b = sorted(map(int, input().split()))    if (2 * a - b >= 0) and not (2 * a - b) % 3:        print("YES")    else:        print("NO") 
