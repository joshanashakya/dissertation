def is_prime(num):    if num == 1 or num % 2 == 0:        return False    if num == 2:        return True    for i in range(3, 1 + int(num**0.5)):        if num % i == 0:            return False    return True  n, m = map(int, input().split())lst = []count = 0 for i in range(2, n+1):    if is_prime(i):        lst.append(i) for i in range(2, len(lst)):    if count == m:        break            for j in range(i):        if lst[j] + lst[j+1] + 1 == lst[i]:            count += 1            break print('YES' if count == m else 'NO')
