def answer(n, m, a, b):    a.sort()    ans = [0] * m    tup_b = [(b[i], i) for i in range(m)]    tup_b.sort(key= lambda t: t[0]) #by value    ptr = 0    a.append(10**10) #to catch the ptr at the end.            for i in range(m):            while a[ptr] <= tup_b[i][0]: #val in a <= val in b            ptr += 1        ans[tup_b[i][1]] = ptr #ptr is answer: number of values <= val in b. Placed in ans array at correct position            return ans def main():    n, m = [int(i) for i in input().split()]    a = [int(i) for i in input().split()]    b = [int(i) for i in input().split()]    print(' '.join(map(str, answer(n, m, a, b))))      returnmain()
