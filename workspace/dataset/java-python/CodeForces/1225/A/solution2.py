na, nb = map(int, input().split()) if na-nb == 8:    print(9, 10)elif nb - na == 1:    print(na*10+9, nb*10) elif na == nb:    print(na*10, nb*10+1) else:    print(-1)     
