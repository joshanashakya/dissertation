# link: https://codeforces.com/contest/714/problem/Bif __name__ == "__main__":    n = int(input())    a = list(map(int, input().split()))    unique = []    for i in a:        if i in unique:            continue        else:            unique.append(i)            if len(unique)>=4:                print("NO")                exit(0)    unique.sort()    # now I have the unique elements in sorted order    if len(unique) <= 2:        print("YES")    else:        # length is 3        # for 3 pairs a, b, c, 2*c = a+b then True else False        if 2*unique[1] == unique[0] + unique[-1]:            print("YES")        else:            print("NO")                 