cases = int(input())while cases:    cases -= 1    num = int(input())    arr = sorted(map(int, input().split()))     base = min(arr[-1], arr[-2]) - 1     ans = min(base, num-2)     print(ans) 
