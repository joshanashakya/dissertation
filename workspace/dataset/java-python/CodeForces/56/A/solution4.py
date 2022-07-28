n = int(input())
d = ['ABSINTH', 'BEER', 'BRANDY', 'CHAMPAGNE', 'GIN', 'RUM', 'SAKE', 'TEQUILA', 'VODKA', 'WHISKEY', 'WINE']
c = 0 for i in range(n):    a = input()
if a.isnumeric() and int(a) < 18:
    c += 1    else:
    if
not a.isnumeric():
if a in d:                c += 1 print(c)
