m = int(input())a = [int(i) for i in input().split()]b = [int(i) for i in input().split()] a_streak = a.copy()b_streak = b.copy() a_streak.sort(reverse=True)b_streak.sort() mapping = {} for ind, b_i in enumerate(b_streak):    if b_i not in mapping:        mapping[b_i] = [a_streak[ind]]    else:        mapping[b_i].append(a_streak[ind]) # print(mapping) ans = []for b_i in b:    ans.append(mapping[b_i].pop()) print(*ans)