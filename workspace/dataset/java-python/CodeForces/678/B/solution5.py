#!/usr/bin/env python3# -*- coding: utf-8 -*-"""Created on Fri Jul 10 10:45:39 2020 @author: shailesh""" def check_leap_year(year):    if year%400 == 0:        return True    elif year%4 == 0 and year%100 != 0:        return True    else:        return False    y = int(input())year = y  leap_year_status = check_leap_year(year)if check_leap_year(year+1):    curr_sum = 366else:    curr_sum = 365    current_leap_year_status = not leap_year_status  year+=1 while(curr_sum % 7 != 0 or (check_leap_year(year)!= leap_year_status)):    if check_leap_year(year+1):        curr_sum += 366#        current_leap_year_status = 1            else:        curr_sum += 365#        current_leap_year_status = 0    year += 1     print(year)