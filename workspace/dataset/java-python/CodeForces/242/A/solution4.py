x, y, a, b = map(int, input().split())vas, pet = a, bans = []while vas <= x:    pet = b    while pet < vas and pet <= y:        ans.append([vas, pet])        pet += 1    vas += 1print(len(ans))for i in range(len(ans)):    print(*ans[i])        
