#input()#int(input())#[s for s in input().split()]#[int(s) for s in input().split()]#for t in range(t): import mathimport collectionsimport bisect def arrPrint(a):    return " ".join([str(i) for i in a]) def gridPrint(a):    return "\n".join([" ".join([str(j) for j in a[i]]) for i in range(len(a))]) def isPalindrome(s):    for i in range(len(s)//2):        if not s[i] == s[-i-1]:            return False    return True def solve(p, l, r, x):    curr = p[x-1]    less = 0    for i in range(l-1, r):        if p[i] < curr:            less += 1    if l + less == x:        return "Yes"    return "No" n, m = [int(s) for s in input().split()]p = [int(s) for s in input().split()]for m in range(m):    l, r, x = [int(s) for s in input().split()]    result = solve(p, l, r, x)    print(result)