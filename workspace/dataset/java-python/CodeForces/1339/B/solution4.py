import sys def answer(n, a):    lst = []    a.sort()    for i in range(n//2):        lst.append(a[i])        lst.append(a[n-i-1])    if n % 2 == 1:        lst.append(a[n//2])    lst.reverse()    return lst def main():    t = int(input())    while t:        n = int(input())        a = [int(i) for i in sys.stdin.readline().split()]        print(' '.join(map(str, answer(n, a))))        t -= 1    returnmain()