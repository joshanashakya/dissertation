n = int(input())s = input()lights = [0 for i in range(500)]for i in range(n):    a,b = map(int,input().split())    if s[i]=='1':        counter = 0        off=1        for j in range(b):            lights[j]+=1        counter = b+a        # print(lights)        while counter<500:            for j in range(counter,counter+a,1):                if j>=500:                    break                lights[j]+=1            counter+=(2*a)     else:        counter = b        while counter<500:            for j in range(counter,counter+a,1):                if j>=500:                    break                lights[j]+=1            counter+=(2*a)print(max(lights))
