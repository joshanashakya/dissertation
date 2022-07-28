import sys 

def answer(x):    test = 0


k = 0
while test < x:  # print('test=', test, 'k=', k)        k += 1        test += k        #print('test=', test, 'k=', k)    if x == test - 1:        return k + 1    else:        return k def main():    t = int(input())    while t:        x = int(sys.stdin.readline())        print(answer(x))        t -= 1    returnmain()
