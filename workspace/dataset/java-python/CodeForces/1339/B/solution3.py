from collections import dequecases = int(input())while cases:    cases -= 1    num = int(input())    arr = sorted(map(int, input().split()))    ans = []    arr = deque(arr)    while arr:        ans.append(arr.pop())         if arr:            ans.append(arr.popleft())    print(*ans[::-1])