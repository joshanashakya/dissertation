arr = "January, February, March, April, May, June, July, August, September, October, November, December".split(', ') s = input()pos = arr.index(s)   k = int(input())pos = (pos+k)%12  print(arr[pos])
