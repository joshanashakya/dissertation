n = int(input())a = n+1x = list(map(int, input().split()))c1 = 1c2 = 0l1 = []l2 = []for i in x:    c1 = c1 + ifor i in range(c1,c1+5):    l1.append(i)for i in l1:    l2.append(i%a)for i in l2:    if i == 1:        pass    else:        c2 = c2 + 1print(c2)
