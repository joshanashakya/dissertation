n = int(input())
crew = []
status = ["rat", ["woman", "child"], "man", "captain"]
leave_first = [] for i in range(n):    crew.append(input()) for i in range(len(status)):    for
j in range(n):
if (i == 1):            if
    (crew[j].split(" ")[1] == status[1][0]): leave_first.append(crew[j].split(" ")[0]) elif (
            crew[j].split(" ")[1] == status[1][1]): leave_first.append(crew[j].split(" ")[0]) elif (
            crew[j].split(" ")[1] == status[i]): leave_first.append(
    crew[j].split(" ")[0]) for i in leave_first:    print(i)
