ALCOHOLIC_DRINKS = ["ABSINTH", "BEER", "BRANDY", "CHAMPAGNE", "GIN", "RUM", "SAKE", "TEQUILA", "VODKA", "WHISKEY",
                    "WINE"] total_clients = int(input()) clients_to_check = 0 for _ in range(
    total_clients):  data = input()    try:    data = int(data)
if data < 18:
    clients_to_check += 1    else:
    continue  except ValueError:
if data in ALCOHOLIC_DRINKS:
    clients_to_check += 1    else:
    continue print(clients_to_check)
