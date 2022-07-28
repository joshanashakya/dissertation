linha = input().split('/')ans = [] for i in range(len(linha)):    if len(linha[i]) > 0:        ans.append(linha[i])        print('/'+'/'.join(ans))
