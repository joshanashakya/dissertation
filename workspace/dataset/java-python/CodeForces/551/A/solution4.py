n = int(input())st = list(map(int, input().strip().split())) studs = [None] + st ranks = [] for i in range(1, len(studs)):    above = 0    for j in range(1, len(studs)):        if studs[j] > studs[i]:            above += 1     ranks.append(above+1) print(' '.join(map(str, ranks)))