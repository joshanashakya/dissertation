n,m = map(int, input().split())s = ''for i in range(n):    s += input()if 'C' in s or 'M' in s or 'Y' in s:    print('#Color')else:    print('#Black&White')
