n = int(input())l = list(map(int,input().split()))for i in range(n-1):    if l[i] != l[-1]:        distance = n-i-1        breakfor j in range(n-1,0,-1):    if l[j] != l[0]:        if j > distance:            distance = j            breakprint(distance)
