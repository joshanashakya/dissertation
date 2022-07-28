def tri_len(n):    return 3*n-2    def triangle(n):    return (n*(n+1))//2    def star(n):    l = tri_len(n)    return triangle(n-1)*3 + triangle(l)    print(star(int(input())))
