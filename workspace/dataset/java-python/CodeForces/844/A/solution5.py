s = input()k = int(input())arr = set(list(s)) x = len(arr)  if(x >= k):    print(0)else:    k -= x    rem = len(s) - x     # print(k,rem)    if k > rem:        print("impossible")    else:        print(k)   
