from collections import defaultdictn, m = list(map(int, input().split()))friends_money = defaultdict(int)for friend in range(1, n+1):    friends_money[friend]for i in range(m):    f1, f2, money = list(map(int, input().split()))    friends_money[f1] = friends_money[f1] - money    friends_money[f2] = friends_money[f2] + money    debt = 0for money in friends_money.values():    if money < 0:        debt = debt + abs(money)print(debt)
