import sys def answer(n, a):    dir = 1    pword = ['a'] * 51    print(''.join(pword))    for i in range(n):        if pword[a[i]] == 'a':            pword[a[i]] = 'b'        else:            pword[a[i]] = 'a'        print(''.join(pword))                    return def main():    t = int(input())    while t:        n = int(sys.stdin.readline())        a = [int(i) for i in sys.stdin.readline().split()]        answer(n, a)         t -= 1    returnmain()