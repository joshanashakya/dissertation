import sysinput = sys.stdin.readline ''' ''' def distinct_digits(num):    snum = str(num)    return len(snum) == len(set(snum)) l, r = map(int, input().split())x = l while x <= r and not distinct_digits(x):    x += 1 print(x if x <= r else -1) 