x1, y1, x2, y2 = [int(ele) for ele in input().strip().split()]num_rad = int(input().strip())radiators = [] def euclid(c1, c2):    return ((c1[0] - c2[0])**2 + (c1[1] - c2[1])**2)**0.5 for i in range(num_rad):    x, y, r = [int(ele) for ele in input().strip().split()]    radiators.append([(x, y), r]) table_coords = sorted([(x1, y1), (x2, y2), (x1, y2), (x2, y1)])general_coords = table_coordsfor x in range(table_coords[0][0] + 1, table_coords[2][0]):    general_coords.append((x, y1))    general_coords.append((x, y2)) for y in range(table_coords[0][1] + 1, table_coords[3][1]):    general_coords.append((x1, y))    general_coords.append((x2, y)) num_blankets = 0for gen in general_coords:    flag = 0    for radiator, radius in radiators:        if euclid(gen, radiator) <= radius:            flag = 1            break    if flag == 0:        num_blankets += 1 print(num_blankets)    
