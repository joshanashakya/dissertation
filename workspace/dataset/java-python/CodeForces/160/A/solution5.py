n = input()l = list(map(int,input().split()))l.sort(reverse = True)count = 0ans = sum(l)for i in range(len(l)):    count += l[i]    if(count > ans/2):        print(i+1)        break
