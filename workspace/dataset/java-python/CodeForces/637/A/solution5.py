a = int(input())b = list(map(int, input().split()))maxi = 0index = 0likes = dict()for i in b:    if i not in likes:        likes[i] = 1        if likes[i] > maxi:            maxi = likes[i]            index = i    else:        likes[i] += 1        if likes[i] > maxi:            maxi = likes[i]            index = iprint(index)
