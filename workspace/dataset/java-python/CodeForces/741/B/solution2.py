# Aluno: Thiago Santos de Moura - 116210967 hoses, pares, peso_total = map(int, input().split())lista_pesos = list(map(int, input().split()))lista_beleza = list(map(int, input().split()))lista = [-1] * hoses  def join(esquerda, direita):    esquerda, direita = get(esquerda), get(direita)    if esquerda != direita:        lista[esquerda] = direita def get(hose):    if lista[hose] < 0:        return hose    lista[hose] = get(lista[hose])    return lista[hose]   for i in range(pares):    esquerda, direita = map(int, input().split())    join(esquerda - 1, direita - 1) grupos = [list() for i in range(hoses)] for i in range(hoses):    grupos[get(i)].append(i) grupos = [group for group in grupos if group]dp = [[0] * (peso_total + 1) for i in range(len(grupos) + 1)]for i in range(len(grupos)):    soma_peso = sum(lista_pesos[x] for x in grupos[i])    soma_beleza = sum(lista_beleza[x] for x in grupos[i])     for j in range(peso_total + 1):        dp[i][j] = max(soma_beleza + dp[i - 1][j - soma_peso]                       if soma_peso <= j else 0, dp[i - 1][j])         for k in grupos[i]:            dp[i][j] = max(dp[i][j], (dp[i - 1][j - lista_pesos[k]] +                                      lista_beleza[k] if lista_pesos[k] <= j else 0)) print(dp[len(grupos) - 1][peso_total])