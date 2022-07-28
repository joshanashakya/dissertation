input()max=101min=101for elem in list(map(int,input().split())):    if elem<min:        max=min        min=elem    elif elem<max and elem!=min:        max=elemprint("NO" if max==101 else max)
