names = {}n = int(input()) for book in range(n):    s, name = map(str, input().split())    taxi = pizza = cafe = 0    for i in range(int(s)):        number = input().replace('-', '')        if number == number[0] * 6:            taxi += 1        elif len(set(number)) == 6:            for j in range(1, len(number)):                if int(number[j]) >= int(number[j - 1]):                    cafe += 1                    break            else:                pizza += 1        else:            cafe += 1    names[name] = {"taxi": taxi, "pizza": pizza, "cafe": cafe} taxi_guys, pizza_guys, cafe_guys = [], [], []max_taxi = max_pizza = max_cafe = 0 for name in names:    max_taxi = max(names[name]["taxi"], max_taxi)    max_pizza = max(names[name]["pizza"], max_pizza)    max_cafe = max(names[name]["cafe"], max_cafe) for name in names:    if names[name]["taxi"] == max_taxi:        taxi_guys.append(name)    if names[name]["pizza"] == max_pizza:        pizza_guys.append(name)    if names[name]["cafe"] == max_cafe:        cafe_guys.append(name) print(f"If you want to call a taxi, you should call: {', '.join(taxi_guys)}.")print(f"If you want to order a pizza, you should call: {', '.join(pizza_guys)}.")print(f"If you want to go to a cafe with a wonderful girl, you should call: {', '.join(cafe_guys)}.")
