n = int(input())
r = lambda: list(map(str, input().split()))
ans = -float('inf')
winner = "xx"
for _ in range(n):    name, *score = r()
point = 0
for i in score[2:]:        point += int(
    i)    # print(name , point)    point += int(score[0]) * 100    point -= int(score[1]) * 50      if point > ans:        ans = point        winner = name print(winner) 
