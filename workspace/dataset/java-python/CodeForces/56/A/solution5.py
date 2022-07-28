t = int(input())
alco = "ABSINTH, BEER, BRANDY, CHAMPAGNE, GIN, RUM, SAKE, TEQUILA, VODKA, WHISKEY, WINE".replace(",", "").split()
check = 0
for _ in range(t):    n = input()
check += int(n.isdigit() and int(n) < 18 or n in alco)
print(check)
