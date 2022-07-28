arr = "ABSINTH, BEER, BRANDY, CHAMPAGNE, GIN, RUM, SAKE, TEQUILA, VODKA, WHISKEY, WINE".split(
    ', ')  # print(arr)n = int(input()) c = 0for i in range(n):    x = input()    try:        if(int(x) < 18): c+=1    except:        if x in arr: c+=1 print(c) 
