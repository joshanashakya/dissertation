# This is a sample Python script. # Press ⌃R to execute it or replace it with your code.# Press Double ⇧ to search everywhere for classes, files, tool windows, actions, and settings.  def print_hi():    # Use a breakpoint in the code line below to debug your script.    num = int(input())    arr = list(map(int, input().split()))    count = 0    if num == 1:        if arr[0] == 0:            print("NO")            return        print("YES")        return    for i in range(len(arr)):        if arr[i] == 0:            count += 1    if count != 1:        print("NO")        return    print("YES")    return  # Press the green button in the gutter to run the script. print_hi() # See PyCharm help at https://www.jetbrains.com/help/pycharm/
