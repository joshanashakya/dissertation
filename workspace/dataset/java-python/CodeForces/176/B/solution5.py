MOD = int(1e9) + 7if __name__ == "__main__":    a = input()    b = input()    k = int(input())    if(len(a) != len(b)):        print(0)        exit()    a = a + a    x = 0    y = 0    for i in range(len(a) // 2):        flag = 1        for j in range(len(b)):            if(a[j + i] != b[j]):                flag = 0                break        if(flag == 1):            x += 1        else:            y += 1    flag = 0    for i in range(len(b)):        if(a[i] != b[i]):            flag = 1    u = 1    v = 0    if(flag == 1):        v = 1        u = 0    for i in range(k):        uu = (u * (x - 1)) % MOD + (v * (x)) % MOD        vv = (u * (y)) % MOD + (v * (y - 1)) % MOD        u = uu % MOD        v = vv % MOD    print(u)  
