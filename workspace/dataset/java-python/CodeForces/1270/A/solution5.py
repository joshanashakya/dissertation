t = int(input())for i in range(t):    temp = [int(x) for x in input().split()]    n = temp[0]    k1 = temp[1]    k2 = temp[2]    a = [int(x) for x in input().split()]    b = [int(x) for x in input().split()]    if max(a) > max(b):        print('yes')    else:        print('no')