import os s = os.read(0, os.fstat(0).st_size)a = [] numb, sign = 0, 1for i in range(len(s)):    if s[i] >= '0':        numb = 10 * numb + ord(s[i]) - 48    else:        if s[i] == '-':            sign = -1        else:            a.append(sign * numb)            numb, sign = 0, 1if s[-1] >= '0':    a.append(sign * numb) mod_add = lambda x, y: x + y if x + y < 998244353 else x + y - 998244353mod_sub = lambda x, y: x + 998244353 - y if x + 998244353 - y < 998244353 else x - y f0, f1 = [1] * 201, [0] * 201for i in xrange(a[0]):    nf0, nf1 = [0] * 201, [0] * 201    for j in xrange(1, 201):        nf0[j], nf1[j] = nf0[j - 1], nf1[j - 1]        if (a[i + 2] == -1) or (j == a[i + 2]):            nf0[j] = mod_add(mod_add(nf0[j], f0[j - 1]), f1[j - 1])            nf1[j] = mod_sub(mod_add(nf1[j], f0[j]), f0[j - 1])            nf1[j] = mod_sub(mod_add(nf1[j], f1[200]), f1[j - 1])    f0, f1 = nf0[:], nf1[:] os.write(1, str(f1[200]))