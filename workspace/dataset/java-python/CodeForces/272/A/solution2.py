n = int(input()) fingers = [int(i) for i in input().split(' ')]fingers = sum(fingers)res = 0for i in range(1, 6):    if (fingers+i-1)%(n+1) != 0:        res+=1 print(res)
