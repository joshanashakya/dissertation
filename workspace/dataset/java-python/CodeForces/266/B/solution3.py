import copy n, t = list(map(int, input().split()))queue = list(input())bqueue = ['N' for i in range(n)] while t > 0:    t -= 1     bqueue[0] = queue[0]     for i in range(n - 1):        if queue[i] == "B" and queue[i + 1] == "G":            bqueue[i] = "G"            bqueue[i + 1] = "B"        else:            if bqueue[i] == 'N':                bqueue[i] = queue[i]            bqueue[i + 1] = queue[i + 1]     queue = copy.deepcopy(bqueue)    bqueue = ['N' for i in range(n)] print("".join(queue))
