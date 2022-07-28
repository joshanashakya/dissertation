x = str(input())start = 'a'count = 0for i in x:    count += min(26 - abs(ord(start)-ord(i)), abs(ord(start)-ord(i)))    start = iprint(count)
