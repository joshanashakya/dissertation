cases = int(input())while cases:    cases -= 1    arr = sorted(map(int, input().split()))     if arr[0] + arr[1] + 1 >= arr[2]:        print("Yes")    else:        print("No")
