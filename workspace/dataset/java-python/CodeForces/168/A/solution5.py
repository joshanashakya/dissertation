from sys import stdin, stdoutimport math,sysfrom itertools import permutations, combinationsfrom collections import defaultdict,deque,OrderedDictfrom os import pathimport bisect as biimport heapq def yes():print('YES')def no():print('NO')if (path.exists('input.txt')):     #------------------Sublime--------------------------------------#    sys.stdin=open('input.txt','r');sys.stdout=open('output.txt','w');    def I():return (int(input()))    def In():return(map(int,input().split()))else:    #------------------PYPY FAst I/o--------------------------------#    def I():return (int(stdin.readline()))    def In():return(map(int,stdin.readline().split()))  def main():    try:        n,x,y=In()        per=math.ceil((y*n)/100)        per=x-per        if per>=0:            print(0)        else:            print(abs(per))    except:        pass        M = 998244353P = 1000000007 if __name__ == '__main__':    #for _ in range(I()):main()    for _ in range(1):main()
