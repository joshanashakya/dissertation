from sys import stdin,stdout#input = stdin.readline def main():    n = int(input())    ans = ["cyan","red"]    for i in range(n):        num = input()        num0 = 0        snum = 0        numm2 = 0        for j in num:            j = int(j)            numm2 += 1 - j % 2            snum += j            num0 += int(j == 0)        print(ans[(num0>0)and(numm2>1)and(snum%3==0)])main()
