time = input()
if int(time[0] + time[1]) >= 12:    newtime = str(int(time[0] + time[1]) - 12).zfill(2) + time[
                                                                                          2:]  else:    newtime = time hour = int(
    newtime[0] + newtime[1])
min = int(newtime[3] + newtime[4]) hourhand = 360 * (hour / 12) + (min / 60) * 30
minhand = 360 * (min / 60) print(hourhand, minhand) 
