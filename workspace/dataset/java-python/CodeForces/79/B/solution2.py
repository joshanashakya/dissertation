# link: https://codeforces.com/contest/79/problem/Bif __name__ == "__main__":    n,m,k,t = map(int,input().split())    kk = k    waste = []    a = ["Carrots", "Kiwis", "Grapes"]    while k:        i,j = map(int,input().split())        waste.append([i-1,j-1])             k -= 1    while t:        i,j = map(int,input().split())        if [i-1,j-1] in waste:            print("Waste")        else:            # add previous sub matrix cell count            count = ((i-1) * m) + (j-1)             # remove the waste cells from the previous submatrix            for k in range(kk):                if (waste[k][0] < i-1) or (waste[k][0] == i-1 and waste[k][1] < j-1):                     count -= 1            print(a[count % 3])                t -= 1
