  n = int(input())arr = input().split() zeros = 0a = 0 for i in arr:    x = i.count('0')    y = i.count('1')    if (i == '1'):        continue     elif (i == '0'):        print(0)        exit(0)     elif (y == 1 and x == len(i) - 1 ):        zeros += x     else:        a = i #print(a) if (a):    ans = a + ('0' * zeros)    print(ans) else:    ans = '1' + ('0' * zeros)    print(ans)      
