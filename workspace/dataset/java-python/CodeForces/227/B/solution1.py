n = int(input()) a = [int(i) for i in input().split(' ')] m = int(input())b = [int(i) for i in input().split(' ')]  store = {}vasya, petya = 0, 0 max_stored = 0 for bi in b:     if bi not in store:         i = max_stored        while bi not in store:                        store[a[i]] = (i+1, n-i)            i+=1        max_stored = i            vasya+=store[bi][0]    petya+=store[bi][1] print(vasya, petya)