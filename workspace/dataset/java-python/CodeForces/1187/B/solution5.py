import sys, string n = int(sys.stdin.readline())arr = list(sys.stdin.readline().rstrip())res = dict().fromkeys(string.ascii_lowercase)for i in res:    res[i] = []for i in range(n):    res[arr[i]].append(i)m = int(sys.stdin.readline())for _ in range(m):    temp = list(sys.stdin.readline().rstrip())    cnt = dict().fromkeys(string.ascii_lowercase, 0)    for i in temp:        cnt[i] += 1    ans = []    for i in cnt:        if cnt[i] != 0:            ans.append(res[i][cnt[i] - 1])    print(max(ans) + 1)
