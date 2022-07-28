sum  = 0 count  = 0 n = int(input()) things = [int(x) for x in input().split()]while sum<n:    sum += things[count]    count = (count+1) % 7 if count == 0:    print(7)else:    print(count)
