cases = int(input())while cases:    cases -= 1    num = int(input())    arr = list(map(int, input().split()))    odds = sum( 1 for i in arr if i %2 != 0)     if odds == 0 or odds == num:        print("YES")    else:        print("NO")