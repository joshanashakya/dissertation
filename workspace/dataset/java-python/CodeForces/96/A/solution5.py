players = input()
number = players[0]
counter = 0

for i in players:
    if (number == i):
        counter += 1
    else:
        number = i
        counter = 1
    if (counter == 7):
        break

if (counter == 7):
    print("YES")
else:
    print("NO")
