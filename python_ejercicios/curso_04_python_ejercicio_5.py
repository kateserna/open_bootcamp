year = input("Escriba un año:")
year = int(year)

def bisiesto (year):
    div4 = (year % 4 == 0)
    div100 = (year % 100 == 0)
    div400 = (year % 400 == 0)
    
    if div400:
        print(year, "es bisiesto")
    elif div4 and not div100:
        print(year, "es bisiesto")
    else: 
        print(year, "no es bisiesto")

bisiesto(year)