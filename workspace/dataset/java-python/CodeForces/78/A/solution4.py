l1 = input()
l2 = input()
l3 = input()
haiku = [l1, l2,
         l3]  # print(haiku)for line in haiku:    count = 0    for c in line:        if c=='a' or c=='e' or c=='i' or c=='o' or c=='u':            count+=1    if (line==haiku[0] and count > 5) or (line==haiku[0] and count < 5):        print("NO")        break    elif (line==haiku[1] and count > 7) or (line==haiku[1] and count < 7):        print("NO")        break    elif (line==haiku[2] and count > 5) or (line==haiku[2] and count < 5):        print("NO")        break if count == 5:    print("YES")
