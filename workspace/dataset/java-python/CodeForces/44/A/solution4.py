seen = set()count = 0for i in range(n := int(input())):    ip = input()    if ip not in seen:        count+=1        seen.add(ip)print(count)
