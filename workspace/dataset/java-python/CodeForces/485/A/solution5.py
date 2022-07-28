a, m = map(int, input().split())for i in range(21):    if a % m == 0:        print("Yes")        exit()    a *= 2print("No")
