try:    n = int(input())    for i in range(n):        s = input()        if (s.endswith("lala.") and s.startswith("miao.")) or (not s.endswith("lala.") and not s.startswith("miao.")):            print("OMG>.< I don't know!" )        elif s.startswith("miao."):            print("Rainbow's")        else:            print("Freda's")except:    pass