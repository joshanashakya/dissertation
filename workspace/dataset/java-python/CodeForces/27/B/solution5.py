n = int(input())wins = [set() for _ in range(n)]looses = [set() for _ in range(n)]for _ in range(n * (n - 1) // 2 - 1):    u, v = list(map(int, input().split()))    u -= 1    v -= 1    wins[u].add(v)    looses[v].add(u) win_set = {}loose_set = {}winners = []loosers = []for i in range(n):    if len(wins[i]) in win_set:        winners.append(i)        winners.append(win_set[len(wins[i])])    else:        win_set[len(wins[i])] = i    if len(looses[i]) in loose_set:        loosers.append(i)        loosers.append(loose_set[len(looses[i])])    else:        loose_set[len(looses[i])] = i if loosers[0] not in wins[winners[0]] and loosers[0] != winners[0]:    print(winners[0] + 1, loosers[0] + 1)elif loosers[0] not in wins[winners[1]] and loosers[0] != winners[1]:    print(winners[1] + 1, loosers[0] + 1)elif loosers[1] not in wins[winners[1]] and loosers[1] != winners[1]:    print(winners[1] + 1, loosers[1] + 1)else:    print(winners[0] + 1, loosers[1] + 1)
