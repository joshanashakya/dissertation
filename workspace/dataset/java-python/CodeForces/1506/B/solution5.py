tests = int(input())
for _ in range(tests):
    n, k = [int(x) for x in input().split()]
    s = list(input())
    start = 0
    end = len(s)
    count = 0
    for i in range(len(s)):
        if s[i] == '*':
            s[i] = 'x'
            start = i
            count += 1
            break
    for i2 in range(len(s)):
        i = len(s) - i2 - 1
        if s[i] == '*':
            s[i] = 'x'
            end = i
            count += 1
            break
    if end == len(s):
        end = start
    counter = 0
    while end - start > k:
        for i in range(start + k, start, -1):
            if s[i] == '*':
                s[i] = 'x'
                start = i
                count += 1
                break
    print(count)
