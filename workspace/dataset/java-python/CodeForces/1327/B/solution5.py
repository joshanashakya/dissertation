import sys def answer(n, g):    #note the first element of each array in g is just the length of the rest of the array.    #taken_princes_set = set()    available_princes_set = {i for i in range(1, n+1, 1)}    #print('available_princes_set=', available_princes_set)    for i in range(n):        if g[i][0] == 0: #no prince requested            print('IMPROVE')            print(i+1, min(available_princes_set))            return        # prince requested.        for k in range(1, g[i][0]+1):            if g[i][k] in available_princes_set:                available_princes_set.remove(g[i][k])                #taken_princes_set.add(g[i][k])                break #match made for girl. End early.            elif k == g[i][0]: #last member, and no match made                print('IMPROVE')                print(i+1, min(available_princes_set))                return    print('OPTIMAL')    return #null #remember problem has princesses as 1-based. def answer2(n, g):    available_princes_set = {i for i in range(1, n+1, 1)}    match = [False] * n    for i in range(n):        for k in range(1, g[i][0]+1):            if g[i][k] in available_princes_set:                available_princes_set.remove(g[i][k])                match[i] = True                break #stop looking for a prince. You've found yours!    for i in range(n):        if match[i] == False:            print('IMPROVE')            print(i+1, min(available_princes_set))            return    print('OPTIMAL')    return    def main():    t = int(input())    while t:        n = int(sys.stdin.readline().rstrip())        g = [0] * n        for j in range(n):            g[j] = [int(i) for i in sys.stdin.readline().split()]        answer2(n, g)        t -= 1    returnmain()
