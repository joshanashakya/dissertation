n = int(input())array = list(map(int, input().split()))answer = ["chest", "biceps", "back", 0, 0, 0] for i in range(n):    if i % 3 == 0:        answer[3] += array[i]    elif i % 3 == 1:        answer[4] += array[i]    elif i % 3 == 2:        answer[5] += array[i] print(answer[answer.index(max(answer[3:])) - 3])
