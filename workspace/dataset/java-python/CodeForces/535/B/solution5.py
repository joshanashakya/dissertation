def answer(n):    l = len(str(n))    lst = []    mask = 0    #print('str(n)', str(n))    for i in range(l):        if str(n)[i] == '7':            mask += 2**(l-1-i)    #print('mask=', mask)    return (2**l - 1) + mask def main():    n = int(input())    print(answer(n))      return main()
